
package it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-12-21T09:41:23.602+01:00
 * Generated source version: 3.3.2
 *
 */
public final class PolicyEnforcerBase_PolicyEnforcerBase_Client {

    private static final QName SERVICE_NAME = new QName("http://pep.base.nmsf.csi.it/", "PolicyEnforcerBaseService");

    private PolicyEnforcerBase_PolicyEnforcerBase_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PolicyEnforcerBaseService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        PolicyEnforcerBaseService ss = new PolicyEnforcerBaseService(wsdlURL, SERVICE_NAME);
        PolicyEnforcerBase port = ss.getPolicyEnforcerBase();

        {
        System.out.println("Invoking isPersonaInRuolo...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _isPersonaInRuolo_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Ruolo _isPersonaInRuolo_in1 = null;
        try {
            boolean _isPersonaInRuolo__return = port.isPersonaInRuolo(_isPersonaInRuolo_in0, _isPersonaInRuolo_in1);
            System.out.println("isPersonaInRuolo.result=" + _isPersonaInRuolo__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (BadRuoloException_Exception e) {
            System.out.println("Expected exception: BadRuoloException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findActorsForPersonaInUseCase...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _findActorsForPersonaInUseCase_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UseCase _findActorsForPersonaInUseCase_in1 = null;
        try {
            java.util.List<it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Actor> _findActorsForPersonaInUseCase__return = port.findActorsForPersonaInUseCase(_findActorsForPersonaInUseCase_in0, _findActorsForPersonaInUseCase_in1);
            System.out.println("findActorsForPersonaInUseCase.result=" + _findActorsForPersonaInUseCase__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchUseCaseException_Exception e) {
            System.out.println("Expected exception: NoSuchUseCaseException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking identificaUserPassword...");
        java.lang.String _identificaUserPassword_in0 = "";
        java.lang.String _identificaUserPassword_in1 = "";
        try {
            it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _identificaUserPassword__return = port.identificaUserPassword(_identificaUserPassword_in0, _identificaUserPassword_in1);
            System.out.println("identificaUserPassword.result=" + _identificaUserPassword__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (IdProviderNotFoundException_Exception e) {
            System.out.println("Expected exception: IdProviderNotFoundException has occurred.");
            System.out.println(e.toString());
        } catch (MalformedUsernameException_Exception e) {
            System.out.println("Expected exception: MalformedUsernameException has occurred.");
            System.out.println(e.toString());
        } catch (AuthException_Exception e) {
            System.out.println("Expected exception: AuthException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking identificaUserPasswordPIN...");
        java.lang.String _identificaUserPasswordPIN_in0 = "";
        java.lang.String _identificaUserPasswordPIN_in1 = "";
        java.lang.String _identificaUserPasswordPIN_in2 = "";
        try {
            it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _identificaUserPasswordPIN__return = port.identificaUserPasswordPIN(_identificaUserPasswordPIN_in0, _identificaUserPasswordPIN_in1, _identificaUserPasswordPIN_in2);
            System.out.println("identificaUserPasswordPIN.result=" + _identificaUserPasswordPIN__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (IdProviderNotFoundException_Exception e) {
            System.out.println("Expected exception: IdProviderNotFoundException has occurred.");
            System.out.println(e.toString());
        } catch (MalformedUsernameException_Exception e) {
            System.out.println("Expected exception: MalformedUsernameException has occurred.");
            System.out.println(e.toString());
        } catch (AuthException_Exception e) {
            System.out.println("Expected exception: AuthException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findRuoliForPersonaInUseCase...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _findRuoliForPersonaInUseCase_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UseCase _findRuoliForPersonaInUseCase_in1 = null;
        try {
            java.util.List<it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Ruolo> _findRuoliForPersonaInUseCase__return = port.findRuoliForPersonaInUseCase(_findRuoliForPersonaInUseCase_in0, _findRuoliForPersonaInUseCase_in1);
            System.out.println("findRuoliForPersonaInUseCase.result=" + _findRuoliForPersonaInUseCase__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchUseCaseException_Exception e) {
            System.out.println("Expected exception: NoSuchUseCaseException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findRuoliForPersonaInApplication...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _findRuoliForPersonaInApplication_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Application _findRuoliForPersonaInApplication_in1 = null;
        try {
            java.util.List<it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Ruolo> _findRuoliForPersonaInApplication__return = port.findRuoliForPersonaInApplication(_findRuoliForPersonaInApplication_in0, _findRuoliForPersonaInApplication_in1);
            System.out.println("findRuoliForPersonaInApplication.result=" + _findRuoliForPersonaInApplication__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findActorsForPersonaInApplication...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _findActorsForPersonaInApplication_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Application _findActorsForPersonaInApplication_in1 = null;
        try {
            java.util.List<it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Actor> _findActorsForPersonaInApplication__return = port.findActorsForPersonaInApplication(_findActorsForPersonaInApplication_in0, _findActorsForPersonaInApplication_in1);
            System.out.println("findActorsForPersonaInApplication.result=" + _findActorsForPersonaInApplication__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking isPersonaAutorizzataInUseCase...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _isPersonaAutorizzataInUseCase_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UseCase _isPersonaAutorizzataInUseCase_in1 = null;
        try {
            boolean _isPersonaAutorizzataInUseCase__return = port.isPersonaAutorizzataInUseCase(_isPersonaAutorizzataInUseCase_in0, _isPersonaAutorizzataInUseCase_in1);
            System.out.println("isPersonaAutorizzataInUseCase.result=" + _isPersonaAutorizzataInUseCase__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchUseCaseException_Exception e) {
            System.out.println("Expected exception: NoSuchUseCaseException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking findUseCasesForPersonaInApplication...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _findUseCasesForPersonaInApplication_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Application _findUseCasesForPersonaInApplication_in1 = null;
        try {
            java.util.List<it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UseCase> _findUseCasesForPersonaInApplication__return = port.findUseCasesForPersonaInApplication(_findUseCasesForPersonaInApplication_in0, _findUseCasesForPersonaInApplication_in1);
            System.out.println("findUseCasesForPersonaInApplication.result=" + _findUseCasesForPersonaInApplication__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getInfoPersonaSchema...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Ruolo _getInfoPersonaSchema_in0 = null;
        try {
            java.lang.String _getInfoPersonaSchema__return = port.getInfoPersonaSchema(_getInfoPersonaSchema_in0);
            System.out.println("getInfoPersonaSchema.result=" + _getInfoPersonaSchema__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (BadRuoloException_Exception e) {
            System.out.println("Expected exception: BadRuoloException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getInfoPersonaInUseCase...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _getInfoPersonaInUseCase_in0 = null;
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.UseCase _getInfoPersonaInUseCase_in1 = null;
        try {
            java.lang.String _getInfoPersonaInUseCase__return = port.getInfoPersonaInUseCase(_getInfoPersonaInUseCase_in0, _getInfoPersonaInUseCase_in1);
            System.out.println("getInfoPersonaInUseCase.result=" + _getInfoPersonaInUseCase__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchApplicationException_Exception e) {
            System.out.println("Expected exception: NoSuchApplicationException has occurred.");
            System.out.println(e.toString());
        } catch (NoSuchUseCaseException_Exception e) {
            System.out.println("Expected exception: NoSuchUseCaseException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (IdentitaNonAutenticaException_Exception e) {
            System.out.println("Expected exception: IdentitaNonAutenticaException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking identificaCertificato...");
        byte[] _identificaCertificato_in0 = new byte[0];
        try {
            it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _identificaCertificato__return = port.identificaCertificato(_identificaCertificato_in0);
            System.out.println("identificaCertificato.result=" + _identificaCertificato__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (IdProviderNotFoundException_Exception e) {
            System.out.println("Expected exception: IdProviderNotFoundException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (CertOutsideValidityException_Exception e) {
            System.out.println("Expected exception: CertOutsideValidityException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        } catch (CertRevokedException_Exception e) {
            System.out.println("Expected exception: CertRevokedException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking isIdentitaAutentica...");
        it.csi.myprod.myprodsrvqrk.api.wsclient.iride2pep.Identita _isIdentitaAutentica_in0 = null;
        try {
            boolean _isIdentitaAutentica__return = port.isIdentitaAutentica(_isIdentitaAutentica_in0);
            System.out.println("isIdentitaAutentica.result=" + _isIdentitaAutentica__return);

        } catch (InternalException_Exception e) {
            System.out.println("Expected exception: InternalException has occurred.");
            System.out.println(e.toString());
        } catch (SystemException_Exception e) {
            System.out.println("Expected exception: SystemException has occurred.");
            System.out.println(e.toString());
        } catch (UnrecoverableException_Exception e) {
            System.out.println("Expected exception: UnrecoverableException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}