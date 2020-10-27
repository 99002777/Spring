package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface Menu {

	List<String> itemsAvailable();

}
