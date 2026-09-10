package kotlinx.serialization.json.internal;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/peridotite;", "Lkotlinx/serialization/json/internal/hydrovane;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "cutely", "()B", "", "marial", "()Z", "", "expected", "", "formularize", "(C)V", "sealless", "", "merc", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class peridotite extends hydrovane {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peridotite(String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // kotlinx.serialization.json.internal.hydrovane, kotlinx.serialization.json.internal.JsonReader
    public byte cutely() {
        String strTrm = trm();
        int iMerc = merc();
        if (iMerc >= strTrm.length() || iMerc == -1) {
            return (byte) 10;
        }
        this.currentPosition = iMerc + 1;
        return saneness.attabal(strTrm.charAt(iMerc));
    }

    @Override // kotlinx.serialization.json.internal.hydrovane, kotlinx.serialization.json.internal.JsonReader
    public void formularize(char expected) {
        String strTrm = trm();
        int iMerc = merc();
        if (iMerc >= strTrm.length() || iMerc == -1) {
            this.currentPosition = -1;
            creditor(expected);
        }
        char cCharAt = strTrm.charAt(iMerc);
        this.currentPosition = iMerc + 1;
        if (cCharAt == expected) {
            return;
        }
        creditor(expected);
    }

    @Override // kotlinx.serialization.json.internal.hydrovane, kotlinx.serialization.json.internal.JsonReader
    public boolean marial() {
        int iMerc = merc();
        if (iMerc >= trm().length() || iMerc == -1) {
            return false;
        }
        return oilcan(trm().charAt(iMerc));
    }

    @Override // kotlinx.serialization.json.internal.hydrovane, kotlinx.serialization.json.internal.JsonReader
    public int merc() {
        int i;
        int iNosophobia = this.currentPosition;
        if (iNosophobia == -1) {
            return iNosophobia;
        }
        String strTrm = trm();
        while (iNosophobia < strTrm.length()) {
            char cCharAt = strTrm.charAt(iNosophobia);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i = iNosophobia + 1) >= strTrm.length()) {
                    break;
                }
                char cCharAt2 = strTrm.charAt(i);
                if (cCharAt2 == '*') {
                    int iLotta = StringsKt.lotta(strTrm, "*/", iNosophobia + 2, false, 4, null);
                    if (iLotta == -1) {
                        this.currentPosition = strTrm.length();
                        JsonReader.rotuma(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iNosophobia = iLotta + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iNosophobia = StringsKt.nosophobia(strTrm, '\n', iNosophobia + 2, false, 4, null);
                    iNosophobia = iNosophobia == -1 ? strTrm.length() : iNosophobia + 1;
                }
            }
        }
        this.currentPosition = iNosophobia;
        return iNosophobia;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    public byte sealless() {
        String strTrm = trm();
        int iMerc = merc();
        if (iMerc >= strTrm.length() || iMerc == -1) {
            return (byte) 10;
        }
        this.currentPosition = iMerc;
        return saneness.attabal(strTrm.charAt(iMerc));
    }
}
