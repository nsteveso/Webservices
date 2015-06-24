package iqn.falcon

import groovyx.net.http.RESTClient
import spock.lang.Specification


class QA4HealthCheckSpec extends Specification {
	
	def "data-person health check"()
	{
		setup:
		def rest = new RESTClient("http://data.qa4.iqn.com:10080/")
		when:
		def resp = rest.get(path : "data-person/health-check/status")
		
		then:
		println "data-person health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "data-security health check"()
	{
		setup:
		def rest = new RESTClient("http://data.qa4.iqn.com:10080/")
		when:
		def resp = rest.get(path : "data-security/health-check/status")
		
		then:
		println "data-security health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "data-notification health check"()
	{
		setup:
		def rest = new RESTClient("http://data.qa4.iqn.com:10080/")
		when:
		def resp = rest.get(path : "data-notification/health-check/status")
		
		then:
		println "data-notification health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "data-location health check"()
	{
		setup:
		def rest = new RESTClient("http://data.qa4.iqn.com:10080/")
		when:
		def resp = rest.get(path : "data-location/health-check/status")
		
		then:
		println "data-location health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "data-business-org health check"()
	{
		setup:
		def rest = new RESTClient("http://data.qa4.iqn.com:10080/")
		when:
		def resp = rest.get(path: "data-business-org/health-check/status")
		
		then:
		println "data-business-org health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "business-dashboard health check"()
	{
		setup:
		def rest = new RESTClient("http://app.qa4.iqn.com:11080/")
		when:
		def resp = rest.get(path: "business-dashboard/health-check/status")
		
		then:
		println "business-dashboard health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "business-security health check"()
	{
		setup:
		def rest = new RESTClient("http://app.qa4.iqn.com:11080/")
		when:
		def resp = rest.get(path: "business-security/health-check/status")
		
		then:
		println "business-security health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "business-user-management health check"()
	{
		setup:
		def rest = new RESTClient("http://app.qa4.iqn.com:11080/")
		when:
		def resp = rest.get(path: "business-user-management/health-check/status")
		
		then:
		println "business-user-management health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "business-notification-engine health check"()
	{
		setup:
		def rest = new RESTClient("http://app.qa4.iqn.com:11080/")
		when:
		def resp = rest.get(path : "business-notification-engine/health-check/status")
		
		then:
		println "business-notification-engine health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "falcon health check"()
	{
		setup:
		def rest = new RESTClient("https://qa4.iqnavigator.com/")
		when:
		def resp = rest.get(path : "falcon/health-check/status")
		
		then:
		println "falcon health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "falcon-admin health check"()
	{
		setup:
		def rest = new RESTClient("https://qa4.iqnavigator.com/")
		when:
		def resp = rest.get(path : "falcon-admin/health-check/status")
		
		then:
		println "falcon-admin health check"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "cas health check 1"()
	{
		setup:
		def rest = new RESTClient("http://security1.qa4.iqn.com:18080/")
		when:
		def resp = rest.get(path : "iqnHealthServices/status")
		
		then:
		println "cas health check 1"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
	
	def "cas health check 2"()
	{
		setup:
		def rest = new RESTClient("http://security2.qa4.iqn.com:18080/")
		when:
		def resp = rest.get(path : "iqnHealthServices/status")
		
		then:
		println "cas health check 2"
		println "The response code was: " + resp.status
		
		with(resp)
		{
			status == 200
		}
	}
}
