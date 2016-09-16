package net.codejava.spring.controller;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.spring.model.dto.NewXmlEntity;
import net.codejava.spring.model.dto.UserDto;
import net.codejava.spring.util.ServiceTemplate;

@RestController
@RequestMapping("/demo")
public class DemoController {

	private static final Logger LOGGER = Logger.getLogger(DemoController.class);

	// Constant declaration start
	private static final String INSIDE_THE_RTURN_JSON_METHOD = "Inside the rturnJSON method";
	private static final String FAILURE = "FAILURE";
	private static final String FAILED_BECAUSE_INPUT_IS_NULL = "Failed because input is null";
	private static final String SUCCESS = "SUCCESS";

	/**
	 * This is a demo function returning the JSON response
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/returnjson", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceTemplate> returnJson(@RequestBody UserDto user) {

		LOGGER.info(INSIDE_THE_RTURN_JSON_METHOD);

		ServiceTemplate serviceTemplate = new ServiceTemplate(SUCCESS, 1l, SUCCESS, null);

		if (user == null) {
			serviceTemplate.setValue(0l);
			serviceTemplate.setMsg(FAILED_BECAUSE_INPUT_IS_NULL);
			serviceTemplate.setType(FAILURE);
		} else {
			serviceTemplate.setData(user);
		}

		return new ResponseEntity<ServiceTemplate>(serviceTemplate, HttpStatus.OK);
	}

	@RequestMapping(value = "/returnxml", method = RequestMethod.POST, produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ResponseEntity<ServiceTemplate> returnXml() {

		LOGGER.info(INSIDE_THE_RTURN_JSON_METHOD);

		ServiceTemplate serviceTemplate = new ServiceTemplate(SUCCESS, 1l, SUCCESS, null);

		NewXmlEntity newXmlEntity = new NewXmlEntity();
		newXmlEntity.setId(1l);
		newXmlEntity.setUsername("demo");

		serviceTemplate.setData(newXmlEntity);

		return new ResponseEntity<ServiceTemplate>(serviceTemplate, HttpStatus.OK);

	}

}
