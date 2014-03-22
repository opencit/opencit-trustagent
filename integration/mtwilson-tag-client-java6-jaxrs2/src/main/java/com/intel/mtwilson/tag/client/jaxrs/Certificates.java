/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intel.mtwilson.tag.client.jaxrs;

import com.intel.dcsg.cpg.io.UUID;
import com.intel.mtwilson.tag.model.Certificate;
import com.intel.mtwilson.tag.model.CertificateCollection;
import com.intel.mtwilson.tag.model.CertificateFilterCriteria;
import java.net.URL;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ssbangal
 */
public class Certificates extends MtWilsonClient {
    
    Logger log = LoggerFactory.getLogger(getClass().getName());

    public Certificates(URL url) {
        //super(url);
    }

    public Certificates(Properties properties) throws Exception {
        super(properties);
    }
    
    /**
     * Retrieves the details of the provisioned certificates based on the search criteria specified. If none
     * of the search criteria is specified, then search would return back and empty result set. The 
     * possible search options include subjectEqualTo, subjectContains, issuerEqualTo, issuerContains, 
     * sha1, sha256, notBefore, notAfter and revoked.  
     * The search always returns back a collection.
     * <p>
     * <i><u>Roles Needed:</u></i> AssetManagement
     * <p>
     * <i><u>Content type returned:</u></i>JSON/XML/YAML<br>
     * <p>
     * <i><u>Sample REST API call :</u></i><br>
     * <i>Method Type: GET</i><br>
     * https://192.168.1.101:8181/mtwilson/v2/tag-certificates?issuer=Intel
     * <p>
     * <i><u>Sample Output:</u></i><br>
     * {"certificates":[{"id":"187ec902-c6c6-4dfb-adb4-f240099aa4b0","certificate":"MIICMj...BYG=","sha1":"7704753ac4a8771499610352f28967e39c75d88b",
     * "sha256":"09740b068caba9e8647488d3e5a1a546e136c47cffcc30198a4446c765e344e0","subject":"2676ee69-e42f-461b-824f-a6ec3d2c08f4",
     * "issuer":"CN=Intel","not_before":1395407513000,"not_after":1426943513000,"revoked":true}]}
     * <p>
     * @since Mt.Wilson 2.0
     */
    public CertificateCollection searchCertificates(CertificateFilterCriteria criteria) {
        return null;
    }
    
    /**
     * Retrieves the details of the Certificate for the specified ID. Note
     * that the ID should be a valid UUID.
     * <p>
     * <i><u>Roles Needed:</u></i> AssetManagement
     * <p>
     * <i><u>Content type returned:</u></i>JSON/XML/YAML
     * <p>
     * <i><u>Sample REST API call :</u></i><br>
     * <i>Method Type: GET</i><br>
     * https://192.168.1.101:8181/mtwilson/v2/tag-certificates/187ec902-c6c6-4dfb-adb4-f240099aa4b0
     * <p>
     * <i><u>Sample Output:</u></i><br>
     * {"id":"187ec902-c6c6-4dfb-adb4-f240099aa4b0","certificate":"MIIO....ic=","sha1":"7704753ac4a8771499610352f28967e39c75d88b",
     * "sha256":"09740b068caba9e8647488d3e5a1a546e136c47cffcc30198a4446c765e344e0","subject":"2676ee69-e42f-461b-824f-a6ec3d2c08f4",
     * "issuer":"CN=Intel","not_before":"2014-03-21","not_after":"2015-03-21","revoked":true}
     * <p>
     * @since Mt.Wilson 2.0
     */
    public Certificate retrieveCertificate(UUID id) {
        return null;
    }

    public Certificate createCertificate(Certificate obj) {
        return null;
    }

    public Certificate editCertificate(Certificate obj) {
        return null;
    }

    /**
     * Deletes the specified certificate from the system.  
     * <p>
     * <i><u>Roles Needed:</u></i> AssetManagement
     * <p>
     * <i><u>Content type returned:</u></i>JSON/XML/YAML
     * <p>
     * <i><u>Sample REST API call :</u></i><br>
     * <i>Method Type: DELETE</i><br>
     * https://192.168.1.101:8181/mtwilson/v2/tag-certificates/187ec902-c6c6-4dfb-adb4-f240099aa4b0
     * <p>
     * <i><u>Sample Output:</u></i><br>
     * NA
     * <p>
     * @since Mt.Wilson 2.0
     */
    public void deleteCertificate(UUID id) {
        return;
    }
    
}