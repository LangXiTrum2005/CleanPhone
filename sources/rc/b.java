package rc;

import android.util.Base64OutputStream;
import com.google.android.gms.internal.play_billing.q1;
import go.k;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f49533b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f49532a = i10;
        this.f49533b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f49532a) {
            case 0:
                c cVar = this.f49533b;
                synchronized (cVar) {
                    try {
                        i iVar = (i) cVar.f49534a.get();
                        ArrayList arrayListA = iVar.a();
                        synchronized (iVar) {
                            iVar.f49566a.a(new bh.a(iVar, 18));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                            a aVar = (a) arrayListA.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f49530a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f49531b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return string;
            default:
                c cVar2 = this.f49533b;
                synchronized (cVar2) {
                    final i iVar2 = (i) cVar2.f49534a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strA = ((od.b) cVar2.f49536c.get()).a();
                    synchronized (iVar2) {
                        final String strB = i.b(jCurrentTimeMillis);
                        final w0.d dVarY = k.Y(strA);
                        iVar2.f49566a.a(new jk.b(iVar2, strB, strA, dVarY) { // from class: rc.g

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f49558a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ String f49559b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ w0.d f49560c;

                            {
                                this.f49558a = strB;
                                this.f49559b = strA;
                                this.f49560c = dVarY;
                            }

                            @Override // jk.b
                            public final Object invoke(Object obj) {
                                Object obj2;
                                w0.b bVar = (w0.b) obj;
                                w0.d dVar = i.f49564c;
                                w0.d dVar2 = i.f49565d;
                                String str = "";
                                String str2 = (String) q1.s(bVar, dVar2, "");
                                String str3 = this.f49558a;
                                boolean zEquals = str2.equals(str3);
                                w0.d dVar3 = this.f49560c;
                                Object obj3 = null;
                                if (zEquals) {
                                    w0.d dVarC = i.c(bVar, str3);
                                    if (dVarC == null || dVarC.f52738a.equals(this.f49559b)) {
                                        return null;
                                    }
                                    i.d(bVar, str3);
                                    HashSet hashSet = new HashSet((Collection) q1.s(bVar, dVar3, new HashSet()));
                                    hashSet.add(str3);
                                    bVar.f(dVar3, hashSet);
                                    return null;
                                }
                                long jLongValue = ((Long) q1.s(bVar, dVar, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    long jLongValue2 = ((Long) q1.s(bVar, dVar, 0L)).longValue();
                                    Set hashSet2 = new HashSet();
                                    String str4 = null;
                                    for (Map.Entry entry : bVar.a().entrySet()) {
                                        if (entry.getValue() instanceof Set) {
                                            Set<String> set = (Set) entry.getValue();
                                            for (String str5 : set) {
                                                Object obj4 = obj3;
                                                if (str4 == null || str4.compareTo(str5) > 0) {
                                                    str = ((w0.d) entry.getKey()).f52738a;
                                                    str4 = str5;
                                                    hashSet2 = set;
                                                }
                                                obj3 = obj4;
                                            }
                                        }
                                        obj3 = obj3;
                                    }
                                    obj2 = obj3;
                                    HashSet hashSet3 = new HashSet(hashSet2);
                                    hashSet3.remove(str4);
                                    bVar.f(k.Y(str), hashSet3);
                                    jLongValue = jLongValue2 - 1;
                                    bVar.f(dVar, Long.valueOf(jLongValue));
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) q1.s(bVar, dVar3, new HashSet()));
                                hashSet4.add(str3);
                                bVar.f(dVar3, hashSet4);
                                bVar.f(dVar, Long.valueOf(jLongValue + 1));
                                bVar.f(dVar2, str3);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
