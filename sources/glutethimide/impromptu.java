package glutethimide;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: GlideUrl.java */
/* JADX INFO: loaded from: classes2.dex */
public class impromptu implements maggot.saneness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public URL f27243beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public volatile byte[] f27244competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final URL f27245dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f27246impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f27247marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final taiyuan f27248saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f27249wireman;

    public impromptu(URL url) {
        this(url, taiyuan.f27295saneness);
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        messageDigest.update(wireman());
    }

    public final String beachfront() {
        if (TextUtils.isEmpty(this.f27247marial)) {
            String string = this.f27249wireman;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.util.apical.wireman(this.f27245dern)).toString();
            }
            this.f27247marial = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f27247marial;
    }

    public final URL competently() throws MalformedURLException {
        if (this.f27243beachfront == null) {
            this.f27243beachfront = new URL(beachfront());
        }
        return this.f27243beachfront;
    }

    public String dern() {
        String str = this.f27249wireman;
        return str != null ? str : ((URL) com.bumptech.glide.util.apical.wireman(this.f27245dern)).toString();
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof impromptu) {
            impromptu impromptuVar = (impromptu) obj;
            if (dern().equals(impromptuVar.dern()) && this.f27248saneness.equals(impromptuVar.f27248saneness)) {
                return true;
            }
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        if (this.f27246impromptu == 0) {
            int iHashCode = dern().hashCode();
            this.f27246impromptu = iHashCode;
            this.f27246impromptu = (iHashCode * 31) + this.f27248saneness.hashCode();
        }
        return this.f27246impromptu;
    }

    public URL impromptu() throws MalformedURLException {
        return competently();
    }

    public Map<String, String> marial() {
        return this.f27248saneness.attabal();
    }

    public String toString() {
        return dern();
    }

    public final byte[] wireman() {
        if (this.f27244competently == null) {
            this.f27244competently = dern().getBytes(maggot.saneness.f33228attabal);
        }
        return this.f27244competently;
    }

    public impromptu(String str) {
        this(str, taiyuan.f27295saneness);
    }

    public impromptu(URL url, taiyuan taiyuanVar) {
        this.f27245dern = (URL) com.bumptech.glide.util.apical.wireman(url);
        this.f27249wireman = null;
        this.f27248saneness = (taiyuan) com.bumptech.glide.util.apical.wireman(taiyuanVar);
    }

    public impromptu(String str, taiyuan taiyuanVar) {
        this.f27245dern = null;
        this.f27249wireman = com.bumptech.glide.util.apical.saneness(str);
        this.f27248saneness = (taiyuan) com.bumptech.glide.util.apical.wireman(taiyuanVar);
    }
}
