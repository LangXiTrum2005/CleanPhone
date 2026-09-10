package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3329eC {
    public static final String[] c = {ProxyConfig.MATCH_ALL_SCHEMES, "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4312a;
    public final String b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public C3329eC(C4266ou c4266ou) {
        c4266ou.a();
        this.f4312a = c4266ou.f4812a.getSharedPreferences("com.google.android.gms.appid", 0);
        c4266ou.a();
        C2323Bu c2323Bu = c4266ou.c;
        String str = c2323Bu.e;
        if (str == null) {
            c4266ou.a();
            str = c2323Bu.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.b = str;
    }

    public final String a() {
        String string;
        synchronized (this.f4312a) {
            string = this.f4312a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f4312a) {
            String strEncodeToString = null;
            String string = this.f4312a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & com.umeng.analytics.pro.cw.m) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }
}
