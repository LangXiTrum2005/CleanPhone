package sanskrit;

import android.content.Context;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ConcurrentHashMap<String, saneness> f37369attabal = new ConcurrentHashMap<>();

    public static synchronized void attabal(Context context, ik ikVar, laky.saneness.attabal attabalVar) {
        if (ikVar == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, saneness> concurrentHashMap = f37369attabal;
            saneness sanenessVar = concurrentHashMap.get(ikVar.bu());
            if (sanenessVar == null) {
                sanenessVar = new saneness(context, ikVar);
                concurrentHashMap.put(ikVar.bu(), sanenessVar);
                ikVar.di();
                ikVar.bu();
            }
            sanenessVar.arytenoidectomy(attabalVar);
            ikVar.di();
            ikVar.bu();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void saneness(ik ikVar) {
        try {
            saneness sanenessVarRemove = f37369attabal.remove(ikVar.bu());
            if (sanenessVarRemove != null) {
                sanenessVarRemove.graveside(true);
            }
            ikVar.di();
            ikVar.bu();
        } catch (Throwable th) {
            throw th;
        }
    }
}
