package com.amazon.clients;

import java.awt.List;

import javax.xml.ws.Holder;

import com.amazon.client.artifacts.AWSECommerceService;
import com.amazon.client.artifacts.AWSECommerceServicePortType;
import com.amazon.client.artifacts.Item;
import com.amazon.client.artifacts.ItemSearch;
import com.amazon.client.artifacts.ItemSearchRequest;
import com.amazon.client.artifacts.Items;
import com.amazon.client.artifacts.OperationRequest;

public class AmazonClientW {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length <1 ) {
			System.err.println("Usage: java amazonclient w <access key");
			return;
		}
		final String access_key=args[0];
		AWSECommerceService service = new AWSECommerceService();
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();
		
		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("quantum gravity");
		
		ItemSearch search = new ItemSearch();
		search.getRequest().add(request);
		search.setAWSAccessKeyId(access_key);
		
		Holder<OperationRequest> operation_request = null;
		Holder<java.util.List<Items>> items = new Holder<java.util.List<Items>>();

	      port.itemSearch(search.getMarketplaceDomain(),
                  search.getAWSAccessKeyId(),
                  search.getAssociateTag(),
                  search.getXMLEscaping(),
                  search.getValidate(),
                  search.getShared(),
                  search.getRequest(),
                  operation_request,
                  items);

  // Unpack the response to print the book titles.
  Items retval = items.value.get(0);       // first and only Items element
  java.util.List<Item> item_list = retval.getItem(); // list of Item subelements
  for (Item item : item_list)              // each Item in the list
    System.out.println(item.getItemAttributes().getTitle());

		
		
		
		
		

	}

}
