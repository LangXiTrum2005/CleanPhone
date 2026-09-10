package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/json/internal/hydrovane;", "Lkotlinx/serialization/json/internal/attabal;", "", "source", "<init>", "(Ljava/lang/String;)V", "", X3.i.L, "supplicat", "(I)I", "", "cutely", "()B", "", "marial", "()Z", "merc", "()I", "", "expected", "", "formularize", "(C)V", "taiyuan", "()Ljava/lang/String;", "keyToMatch", "isLenient", "yemenite", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "hydrovane", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class hydrovane extends JsonReader {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final String source;

    public hydrovane(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public byte cutely() {
        String strTrm = trm();
        int i = this.currentPosition;
        while (i != -1 && i < strTrm.length()) {
            int i2 = i + 1;
            char cCharAt = strTrm.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i2;
                return saneness.attabal(cCharAt);
            }
            i = i2;
        }
        this.currentPosition = strTrm.length();
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public void formularize(char expected) {
        if (this.currentPosition == -1) {
            creditor(expected);
        }
        String strTrm = trm();
        int i = this.currentPosition;
        while (i < strTrm.length()) {
            int i2 = i + 1;
            char cCharAt = strTrm.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i2;
                if (cCharAt == expected) {
                    return;
                } else {
                    creditor(expected);
                }
            }
            i = i2;
        }
        this.currentPosition = -1;
        creditor(expected);
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: hydrovane, reason: from getter and merged with bridge method [inline-methods] */
    public String trm() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public boolean marial() {
        int i = this.currentPosition;
        if (i == -1) {
            return false;
        }
        String strTrm = trm();
        while (i < strTrm.length()) {
            char cCharAt = strTrm.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i;
                return oilcan(cCharAt);
            }
            i++;
        }
        this.currentPosition = i;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public int merc() {
        char cCharAt;
        int i = this.currentPosition;
        if (i == -1) {
            return i;
        }
        String strTrm = trm();
        while (i < strTrm.length() && ((cCharAt = strTrm.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.currentPosition = i;
        return i;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public int supplicat(int position) {
        if (position < trm().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public String taiyuan() {
        formularize('\"');
        int i = this.currentPosition;
        int iNosophobia = StringsKt.nosophobia(trm(), '\"', i, false, 4, null);
        if (iNosophobia == -1) {
            monoploid();
            preprohormone((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i2 = i; i2 < iNosophobia; i2++) {
            if (trm().charAt(i2) == '\\') {
                return arytenoidectomy(trm(), this.currentPosition, i2);
            }
        }
        this.currentPosition = iNosophobia + 1;
        String strSubstring = trm().substring(i, iNosophobia);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public String yemenite(String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.currentPosition;
        try {
            if (cutely() == 6 && Intrinsics.wireman(kattegat(isLenient), keyToMatch)) {
                graveside();
                if (cutely() == 5) {
                    return kattegat(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i;
            graveside();
        }
    }
}
