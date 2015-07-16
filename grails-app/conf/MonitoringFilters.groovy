// grails-app/conf/MonitoringFilters.groovy
import org.apache.shiro.SecurityUtils
class MonitoringFilters {

    def dependsOn = [ShiroSecurityFilters]

    def filters = {
        myMonitoringArea(uri: "/monitor") {
           before = {      
           	  println "does it work?"
              SecurityUtils.subject.hasRole('ADMIN')             
           }
        }       
    }
}