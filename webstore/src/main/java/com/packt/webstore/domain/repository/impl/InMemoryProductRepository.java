package com.packt.webstore.domain.repository.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository {

	private List<Product> listOfProducts = new ArrayList<Product>();

	public InMemoryProductRepository() {
		Product iphone = new Product("P1234", "iPhone 5s", 500);
		iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
		iphone.setCategory("Smart Phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);

		Product laptop_dell = new Product("P1235", "Dell Inspiron", 700);
		laptop_dell.setDescription("Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors");
		laptop_dell.setCategory("Laptop");
		laptop_dell.setManufacturer("Dell");
		laptop_dell.setUnitsInStock(1000);

		Product tablet_Nexus = new Product("P1236", "Nexus 7", 300);
		tablet_Nexus.setDescription(
				"Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm Snapdragon™ S4 Pro processor");
		tablet_Nexus.setCategory("Tablet");
		tablet_Nexus.setManufacturer("Google");
		tablet_Nexus.setUnitsInStock(1000);

		listOfProducts.add(iphone);
		listOfProducts.add(laptop_dell);
		listOfProducts.add(tablet_Nexus);

	}

	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	public Product getProductById(String productId) {
		Product productById = null;

		for (Product product : listOfProducts) {
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}

		if (productById == null) {
			throw new IllegalArgumentException("No products found with the product id: " + productId);
		}

		return productById;
	}

	public void ReadProducts() throws IOException {
		String fileName = "Products,txt";
		String line = null;
		Product readProduct = new Product();

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// See how many products do we have first
			int nProducts = 0;
			String r;
			if ((r = bufferedReader.readLine()) != null) {
				nProducts = Integer.parseInt(r);
				
			}

			for (int i=0; i<nProducts; ++i) {
				if ((line = bufferedReader.readLine()) != null) {
					readProduct.setProductId(line);
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setName(line);
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setUnitPrice(Integer.parseInt(line));
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setDescription(line);
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setManufacturer(line);
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setCategory(line);
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setUnitsInStock(Integer.parseInt(line));
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setUnitsInOrder(Integer.parseInt(line));
				} else if ((line = bufferedReader.readLine()) != null) {
					if (!line.equals("/"))
						readProduct.setDiscontinued(Boolean.parseBoolean(line));
				}

				listOfProducts.add(readProduct);
			}
			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}

	public void WriteProducts() throws IOException {
		// The name of the file to open.
		String filePath = "C:\\Users\\hp\\Documents\\workspace-sts-3.9.5.RELEASE\\AppWebStore\\webstore\\src\\DataBaseFileSystem\\Products.txt";

		try {
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(filePath);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter outFile = new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			
			outFile.write(listOfProducts.size());
			outFile.newLine();
			for (Product product : listOfProducts) {
				if (!product.getProductId().isEmpty()) {
					outFile.write(product.getProductId());
				} else
					outFile.write("/");
				outFile.newLine();

				if (!product.getName().isEmpty()) {
					outFile.write(product.getName());
				} else
					outFile.write("/");
				outFile.newLine();

				if (product.getUnitPrice() == 0) {
					outFile.write((int) product.getUnitPrice());
				} else
					outFile.write("/");
				outFile.newLine();

				if (!product.getDescription().isEmpty()) {
					outFile.write(product.getDescription());
				} else
					outFile.write("/");
				outFile.newLine();

				if (!product.getManufacturer().isEmpty()) {
					outFile.write(product.getManufacturer());
				} else
					outFile.write("/");
				outFile.newLine();

				if (!product.getCategory().isEmpty()) {
					outFile.write(product.getCategory());
				} else
					outFile.write("/");
				outFile.newLine();

				if (product.getUnitsInStock() == 0) {
					outFile.write((int) product.getUnitsInStock());
				} else
					outFile.write("/");
				outFile.newLine();

				if (product.getUnitsInOrder() == 0) {
					outFile.write((int) product.getUnitsInOrder());
				} else
					outFile.write("/");
				outFile.newLine();

				outFile.write(product.getDiscontinued().toString());
				outFile.newLine();
				outFile.newLine();
			}
			
			// Always close files.
			outFile.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + filePath + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

	public List<Product> getProductsByCategory(String category) {
		List<Product> productsByCategory = new ArrayList<Product>();

		for (Product product : listOfProducts) {
			if (category.equalsIgnoreCase(product.getCategory())) {
				productsByCategory.add(product);
			}
		}

		return productsByCategory;
	}

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		Set<Product> productsByBrand = new HashSet<Product>();
		Set<Product> productsByCategory = new HashSet<Product>();

		Set<String> criterias = filterParams.keySet();

		if (criterias.contains("brand")) {
			for (String brandName : filterParams.get("brand")) {
				for (Product product : listOfProducts) {
					if (brandName.equalsIgnoreCase(product.getManufacturer())) {
						productsByBrand.add(product);
					}
				}
			}
		}

		if (criterias.contains("category")) {
			for (String category : filterParams.get("category")) {
				productsByCategory.addAll(this.getProductsByCategory(category));
			}
		}

		productsByCategory.retainAll(productsByBrand);

		return productsByCategory;
	}

	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
	public List<Product> getProductsByManufacturer(String manufacturer) {
		List<Product> listByManufacturer = new ArrayList<Product>();
		
		for (Product product : listOfProducts) {
			if (manufacturer.equalsIgnoreCase(product.getManufacturer())) {
				listByManufacturer.add(product);
			}
		}
		
		return listByManufacturer;
	}
	
	public Set<Product> getProductsByPrice(int low, int high) {
		Set<Product> listByPrice = new HashSet<Product>();
		
		for (Product product : listOfProducts) {
			if (product.getUnitPrice() >= low && product.getUnitPrice() <= high) {
				listByPrice.add(product);
			}
		}
		
		return listByPrice;
	}
}
