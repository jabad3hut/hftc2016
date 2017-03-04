package org.pcat.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HomeVisitorEmailRequestBO {
	public static final String HOME_VISITOR_SUBJECT = "Requesting supplies for family %s";
	public static final String HOME_VISITOR_MESSAGE = "Requestor:  %s %s%nApprover:  %s%nThese items have been requested:%s";

	public String getMessageBody(String firstName, String lastname, String supervisor, List<String> itemList) {
		StringBuffer items = new StringBuffer();
		itemList.forEach(item -> items.append(String.format("%n%s", item)));
		return String.format(HOME_VISITOR_MESSAGE, firstName, lastname, supervisor, items);
	}

}
