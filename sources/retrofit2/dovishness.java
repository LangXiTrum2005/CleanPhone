package retrofit2;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public final class dovishness {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final char[] f36473formularize = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final Pattern f36474impassible = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    @Nullable
    public okhttp3.cord f36475apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f36476attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final okhttp3.molybdenite.attabal f36477beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    @Nullable
    public okhttp3.dovishness f36478competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    @Nullable
    public okhttp3.polloi.attabal f36479cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Nullable
    public String f36480dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f36481impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final okhttp3.preprohormone.attabal f36482marial = new okhttp3.preprohormone.attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final okhttp3.graveside f36483saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    @Nullable
    public okhttp3.gintrap.attabal f36484taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public okhttp3.graveside.attabal f36485wireman;

    /* JADX INFO: compiled from: RequestBuilder.java */
    public static class attabal extends okhttp3.cord {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final okhttp3.cord f36486attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final okhttp3.dovishness f36487saneness;

        public attabal(okhttp3.cord cordVar, okhttp3.dovishness dovishnessVar) {
            this.f36486attabal = cordVar;
            this.f36487saneness = dovishnessVar;
        }

        @Override // okhttp3.cord
        public long contentLength() throws IOException {
            return this.f36486attabal.contentLength();
        }

        @Override // okhttp3.cord
        /* JADX INFO: renamed from: contentType */
        public okhttp3.dovishness getContentType() {
            return this.f36487saneness;
        }

        @Override // okhttp3.cord
        public void writeTo(duvetyn.marial marialVar) throws IOException {
            this.f36486attabal.writeTo(marialVar);
        }
    }

    public dovishness(String str, okhttp3.graveside gravesideVar, @Nullable String str2, @Nullable okhttp3.molybdenite molybdeniteVar, @Nullable okhttp3.dovishness dovishnessVar, boolean z, boolean z2, boolean z3) {
        this.f36476attabal = str;
        this.f36483saneness = gravesideVar;
        this.f36480dern = str2;
        this.f36478competently = dovishnessVar;
        this.f36481impromptu = z;
        if (molybdeniteVar != null) {
            this.f36477beachfront = molybdeniteVar.marial();
        } else {
            this.f36477beachfront = new okhttp3.molybdenite.attabal();
        }
        if (z2) {
            this.f36479cutely = new okhttp3.polloi.attabal();
        } else if (z3) {
            okhttp3.gintrap.attabal attabalVar = new okhttp3.gintrap.attabal();
            this.f36484taiyuan = attabalVar;
            attabalVar.wireman(okhttp3.gintrap.f34240apical);
        }
    }

    public static void cutely(duvetyn.wireman wiremanVar, String str, int i, int i2, boolean z) throws EOFException {
        duvetyn.wireman wiremanVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (wiremanVar2 == null) {
                        wiremanVar2 = new duvetyn.wireman();
                    }
                    wiremanVar2.monroe(iCodePointAt);
                    while (!wiremanVar2.exhausted()) {
                        byte b = wiremanVar2.readByte();
                        int i3 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        wiremanVar.writeByte(37);
                        char[] cArr = f36473formularize;
                        wiremanVar.writeByte(cArr[(i3 >> 4) & 15]);
                        wiremanVar.writeByte(cArr[b & 15]);
                    }
                } else {
                    wiremanVar.monroe(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static String taiyuan(String str, boolean z) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                duvetyn.wireman wiremanVar = new duvetyn.wireman();
                wiremanVar.writeUtf8(str, 0, iCharCount);
                cutely(wiremanVar, str, iCharCount, length, z);
                return wiremanVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public okhttp3.preprohormone.attabal apical() {
        okhttp3.graveside gravesideVarPolloi;
        okhttp3.graveside.attabal attabalVar = this.f36485wireman;
        if (attabalVar != null) {
            gravesideVarPolloi = attabalVar.dern();
        } else {
            gravesideVarPolloi = this.f36483saneness.polloi(this.f36480dern);
            if (gravesideVarPolloi == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f36483saneness + ", Relative: " + this.f36480dern);
            }
        }
        okhttp3.cord attabalVar2 = this.f36475apical;
        if (attabalVar2 == null) {
            okhttp3.polloi.attabal attabalVar3 = this.f36479cutely;
            if (attabalVar3 != null) {
                attabalVar2 = attabalVar3.dern();
            } else {
                okhttp3.gintrap.attabal attabalVar4 = this.f36484taiyuan;
                if (attabalVar4 != null) {
                    attabalVar2 = attabalVar4.dern();
                } else if (this.f36481impromptu) {
                    attabalVar2 = okhttp3.cord.create((okhttp3.dovishness) null, new byte[0]);
                }
            }
        }
        okhttp3.dovishness dovishnessVar = this.f36478competently;
        if (dovishnessVar != null) {
            if (attabalVar2 != null) {
                attabalVar2 = new attabal(attabalVar2, dovishnessVar);
            } else {
                this.f36477beachfront.attabal("Content-Type", dovishnessVar.getMediaType());
            }
        }
        return this.f36482marial.dovishness(gravesideVarPolloi).taiyuan(this.f36477beachfront.marial()).cutely(this.f36476attabal, attabalVar2);
    }

    public void attabal(String str, String str2, boolean z) {
        if (z) {
            this.f36479cutely.saneness(str, str2);
        } else {
            this.f36479cutely.attabal(str, str2);
        }
    }

    public void beachfront(String str, String str2, boolean z) throws EOFException {
        if (this.f36480dern == null) {
            throw new AssertionError();
        }
        String strTaiyuan = taiyuan(str2, z);
        String strReplace = this.f36480dern.replace("{" + str + "}", strTaiyuan);
        if (!f36474impassible.matcher(strReplace).matches()) {
            this.f36480dern = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void competently(String str, @Nullable String str2, boolean z) {
        String str3 = this.f36480dern;
        if (str3 != null) {
            okhttp3.graveside.attabal attabalVarFormularize = this.f36483saneness.formularize(str3);
            this.f36485wireman = attabalVarFormularize;
            if (attabalVarFormularize == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f36483saneness + ", Relative: " + this.f36480dern);
            }
            this.f36480dern = null;
        }
        if (z) {
            this.f36485wireman.attabal(str, str2);
        } else {
            this.f36485wireman.saneness(str, str2);
        }
    }

    public void dern(okhttp3.molybdenite molybdeniteVar) {
        this.f36477beachfront.saneness(molybdeniteVar);
    }

    public void formularize(okhttp3.cord cordVar) {
        this.f36475apical = cordVar;
    }

    public void impassible(Object obj) {
        this.f36480dern = obj.toString();
    }

    public <T> void impromptu(Class<T> cls, @Nullable T t) {
        this.f36482marial.polloi(cls, t);
    }

    public void marial(okhttp3.gintrap.dern dernVar) {
        this.f36484taiyuan.saneness(dernVar);
    }

    public void saneness(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f36477beachfront.attabal(str, str2);
            return;
        }
        try {
            this.f36478competently = okhttp3.dovishness.marial(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    public void wireman(okhttp3.molybdenite molybdeniteVar, okhttp3.cord cordVar) {
        this.f36484taiyuan.attabal(molybdeniteVar, cordVar);
    }
}
