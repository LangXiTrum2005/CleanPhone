package energid;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: compiled from: WebMessageAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final String[] f25856kowloon = {Features.WEB_MESSAGE_ARRAY_BUFFER};

    public static http.impromptu[] attabal(InvocationHandler[] invocationHandlerArr) {
        http.impromptu[] impromptuVarArr = new http.impromptu[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            impromptuVarArr[i] = new molybdenite(invocationHandlerArr[i]);
        }
        return impromptuVarArr;
    }

    public static http.competently saneness(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        http.impromptu[] impromptuVarArrAttabal = attabal(webMessageBoundaryInterface.getPorts());
        if (!adultoid.f25819trm.dern()) {
            return new http.competently(webMessageBoundaryInterface.getData(), impromptuVarArrAttabal);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new http.competently(webMessagePayloadBoundaryInterface.getAsString(), impromptuVarArrAttabal);
        }
        if (type != 1) {
            return null;
        }
        return new http.competently(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), impromptuVarArrAttabal);
    }
}
