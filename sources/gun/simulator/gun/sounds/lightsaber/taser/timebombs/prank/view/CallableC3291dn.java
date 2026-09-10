package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3291dn implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4291a;
    public final /* synthetic */ C3379en b;

    public /* synthetic */ CallableC3291dn(C3379en c3379en, int i) {
        this.f4291a = i;
        this.b = c3379en;
    }

    private final String a() {
        String string;
        C3379en c3379en = this.b;
        synchronized (c3379en) {
            try {
                C5062xz c5062xz = (C5062xz) c3379en.f4338a.get();
                ArrayList arrayListC = c5062xz.c();
                c5062xz.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListC.size(); i++) {
                    C2969a8 c2969a8 = (C2969a8) arrayListC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c2969a8.f4111a);
                    jSONObject.put("dates", new JSONArray((Collection) c2969a8.b));
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
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4291a) {
            case 0:
                return a();
            default:
                C3379en c3379en = this.b;
                synchronized (c3379en) {
                    ((C5062xz) c3379en.f4338a.get()).k(System.currentTimeMillis(), ((C3645ho) c3379en.c.get()).a());
                    break;
                }
                return null;
        }
    }
}
