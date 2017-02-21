package org.pcat.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HomeVisitorEmailRequestBO {
	public static final String HOME_VISITOR_SUBJECT = "Requesting supplies for family %s at %s";
	public static final String HOME_VISITOR_MESSAGE = "These items have been requested by %s %s: %s";
	private final String newline = System.getProperty("line.separator");

	public String getMessageBody(String location, String firstName, String lastname, List<String> itemList) {
		StringBuffer items = new StringBuffer();
		itemList.forEach(item -> items.append(newline + item));

		return String.format(HOME_VISITOR_MESSAGE, firstName, lastname, items);
	}

}
