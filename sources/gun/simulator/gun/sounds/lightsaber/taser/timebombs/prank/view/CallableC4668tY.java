package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC4668tY implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5037a;
    public final /* synthetic */ Object b;

    public /* synthetic */ CallableC4668tY(Object obj, int i) {
        this.f5037a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C2803Uh c2803UhA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.f5037a) {
            case 0:
                return ((C4844vY) this.b).c();
            case 1:
                C2726Ri c2726Ri = (C2726Ri) this.b;
                synchronized (c2726Ri) {
                    c2803UhA = null;
                    try {
                        try {
                            fileInputStreamOpenFileInput = c2726Ri.f3673a.openFileInput(c2726Ri.b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                c2803UhA = C2803Uh.a(new JSONObject(new String(bArr, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME)));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th3) {
                            fileInputStreamOpenFileInput = null;
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return c2803UhA;
            case 2:
                return Yi0.m221getAvailableBidTokens$lambda3((InterfaceC3069bH) this.b);
            default:
                return C4418qf0.m268readUnclosedAdFromFile$lambda2((C4418qf0) this.b);
        }
    }
}
