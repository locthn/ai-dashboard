
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.model.FailureHandling


 /**
	 * basic authentication
	 */ 
def static "katalon.truetest.Authenticate.basic_auth"(
    	String url	
     , 	String userName	
     , 	String password	) {
    (new katalon.truetest.Authenticate()).basic_auth(
        	url
         , 	userName
         , 	password)
}

 /**
	 * basic authentication with FailureHandling
	 */ 
def static "katalon.truetest.Authenticate.basic_auth"(
    	String url	
     , 	String userName	
     , 	String password	
     , 	FailureHandling failureHandling	) {
    (new katalon.truetest.Authenticate()).basic_auth(
        	url
         , 	userName
         , 	password
         , 	failureHandling)
}
