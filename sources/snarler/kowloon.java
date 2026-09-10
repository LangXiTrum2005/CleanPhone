package snarler;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConfigStorageClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<String, kowloon> f37675dern = new HashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f37676attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f37677saneness;

    public kowloon(Context context, String str) {
        this.f37676attabal = context;
        this.f37677saneness = str;
    }

    public static synchronized kowloon saneness(Context context, String str) {
        Map<String, kowloon> map;
        try {
            map = f37675dern;
            if (!map.containsKey(str)) {
                map.put(str, new kowloon(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    public String attabal() {
        return this.f37677saneness;
    }

    @Nullable
    public synchronized com.google.firebase.remoteconfig.internal.saneness dern() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            try {
                fileInputStreamOpenFileInput = this.f37676attabal.openFileInput(this.f37677saneness);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    com.google.firebase.remoteconfig.internal.saneness sanenessVarSaneness = com.google.firebase.remoteconfig.internal.saneness.saneness(new JSONObject(new String(bArr, C.UTF8_NAME)));
                    fileInputStreamOpenFileInput.close();
                    return sanenessVarSaneness;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
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

    public synchronized Void wireman(com.google.firebase.remoteconfig.internal.saneness sanenessVar) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f37676attabal.openFileOutput(this.f37677saneness, 0);
        try {
            fileOutputStreamOpenFileOutput.write(sanenessVar.toString().getBytes(C.UTF8_NAME));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th) {
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        return null;
    }
}
