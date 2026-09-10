package eb;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f40000b = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40001a = new HashMap();

    public final synchronized void a(String str, va.i iVar) {
        try {
            if (!this.f40001a.containsKey(str)) {
                this.f40001a.put(str, iVar);
                return;
            }
            if (((va.i) this.f40001a.get(str)).equals(iVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f40001a.get(str) + "), cannot insert " + iVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (va.i) entry.getValue());
        }
    }
}
