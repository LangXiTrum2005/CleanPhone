package kotlinx.serialization.json.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.X3;
import java.util.ArrayList;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.attabal, reason: from toString */
/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\u000fH&¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*H\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001f¢\u0006\u0004\b.\u0010\u0003J\u0015\u00100\u001a\u00020&2\u0006\u0010/\u001a\u00020&¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020*H&¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020*H\u0004¢\u0006\u0004\b4\u00103J!\u00108\u001a\u0002072\u0006\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020&H\u0016¢\u0006\u0004\b:\u0010(J\u0017\u0010<\u001a\u00020\u000f2\b\b\u0002\u0010;\u001a\u00020\u000f¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H&¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u000fH&¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0004\u0018\u00010\n2\u0006\u0010A\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u001f¢\u0006\u0004\bF\u0010\u0003J\u001f\u0010H\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\fJ\u000f\u0010I\u001a\u00020\nH&¢\u0006\u0004\bI\u0010\u000eJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u000eJ'\u0010K\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0005¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\n¢\u0006\u0004\bM\u0010\u000eJ\r\u0010N\u001a\u00020\n¢\u0006\u0004\bN\u0010\u000eJ\u001f\u0010Q\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0014¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u000f¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010\u000eJ\u0015\u0010X\u001a\u00020\u001f2\u0006\u0010W\u001a\u00020\n¢\u0006\u0004\bX\u0010YJ)\u0010\\\u001a\u0002072\u0006\u0010Z\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\n¢\u0006\u0004\b\\\u0010]J\r\u0010_\u001a\u00020^¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u000f¢\u0006\u0004\ba\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010bR\u0014\u0010e\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010fR&\u0010o\u001a\u00060hj\u0002`i8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bQ\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010\u0016\u001a\u00020\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006r"}, d2 = {"Lkotlinx/serialization/json/internal/attabal;", "", "<init>", "()V", "", "lastPosition", "current", "saneness", "(II)I", "currentPosition", "", "molybdenite", "(II)Ljava/lang/String;", "seminary", "()Ljava/lang/String;", "", "starveling", "()Z", "startPosition", "attabal", "(I)I", "", "source", "startPos", "dern", "(Ljava/lang/CharSequence;I)I", "stratoscope", "start", "beachfront", "(I)Z", "literalSuffix", "", "impromptu", "(Ljava/lang/String;I)V", "adultoid", X3.i.L, "supplicat", "marial", "", "cutely", "()B", "grimness", "", "c", "oilcan", "(C)Z", "dovishness", "expected", "apical", "(B)B", "formularize", "(C)V", "creditor", "expectedToken", "wasConsumed", "", "preprohormone", "(BZ)Ljava/lang/Void;", "sealless", "doConsume", "saran", "(Z)Z", "merc", "()I", "keyToMatch", "isLenient", "yemenite", "(Ljava/lang/String;Z)Ljava/lang/String;", "kattegat", "(Z)Ljava/lang/String;", "graveside", "endPos", "polder", "taiyuan", "kowloon", "arytenoidectomy", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "polloi", "monoploid", "fromIndex", "toIndex", "wireman", "(II)V", "allowLenientStrings", "restrictive", "(Z)V", "toString", X3.i.W, "cuirassed", "(Ljava/lang/String;)V", PglCryptUtils.KEY_MESSAGE, "hint", "gintrap", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "impassible", "()J", "competently", "I", "Lkotlinx/serialization/json/internal/stratoscope;", "Lkotlinx/serialization/json/internal/stratoscope;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "trm", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JsonReader {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public int currentPosition;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public String peekedString;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final stratoscope path = new stratoscope();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public StringBuilder escapedString = new StringBuilder();

    public static /* synthetic */ Void cord(JsonReader jsonReader, byte b, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return jsonReader.preprohormone(b, z);
    }

    public static /* synthetic */ boolean privatdozent(JsonReader jsonReader, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return jsonReader.saran(z);
    }

    public static /* synthetic */ Void rotuma(JsonReader jsonReader, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = jsonReader.currentPosition;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return jsonReader.gintrap(str, i, str2);
    }

    public static final double triweekly(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final byte apical(byte expected) {
        byte bCutely = cutely();
        if (bCutely == expected) {
            return bCutely;
        }
        cord(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public final String arytenoidectomy(CharSequence source, int startPosition, int current) {
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(current);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iSupplicat = supplicat(saneness(startPosition, current));
                if (iSupplicat == -1) {
                    rotuma(this, "Unexpected EOF", iSupplicat, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z = true;
                startPosition = iSupplicat;
                current = startPosition;
            } else {
                current++;
                if (current >= source.length()) {
                    wireman(startPosition, current);
                    int iSupplicat2 = supplicat(current);
                    if (iSupplicat2 == -1) {
                        rotuma(this, "Unexpected EOF", iSupplicat2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    startPosition = iSupplicat2;
                    current = startPosition;
                    z = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(current);
        }
        String strPolder = !z ? polder(startPosition, current) : molybdenite(startPosition, current);
        this.currentPosition = current + 1;
        return strPolder;
    }

    public final int attabal(int startPosition) {
        int iSupplicat = supplicat(startPosition);
        if (iSupplicat == -1) {
            rotuma(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i = iSupplicat + 1;
        char cCharAt = trm().charAt(iSupplicat);
        if (cCharAt == 'u') {
            return dern(trm(), i);
        }
        char cSaneness = saneness.saneness(cCharAt);
        if (cSaneness != 0) {
            this.escapedString.append(cSaneness);
            return i;
        }
        rotuma(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean beachfront(int start) {
        int iSupplicat = supplicat(start);
        if (iSupplicat >= trm().length() || iSupplicat == -1) {
            rotuma(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i = iSupplicat + 1;
        int iCharAt = trm().charAt(iSupplicat) | ' ';
        if (iCharAt == 102) {
            impromptu("alse", i);
            return false;
        }
        if (iCharAt == 116) {
            impromptu("rue", i);
            return true;
        }
        rotuma(this, "Expected valid boolean literal prefix, but had '" + monoploid() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean competently() {
        boolean z;
        int iMerc = merc();
        if (iMerc == trm().length()) {
            rotuma(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (trm().charAt(iMerc) == '\"') {
            iMerc++;
            z = true;
        } else {
            z = false;
        }
        boolean zBeachfront = beachfront(iMerc);
        if (!z) {
            return zBeachfront;
        }
        if (this.currentPosition == trm().length()) {
            rotuma(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (trm().charAt(this.currentPosition) == '\"') {
            this.currentPosition++;
            return zBeachfront;
        }
        rotuma(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void creditor(char expected) {
        int i = this.currentPosition;
        if (i > 0 && expected == '\"') {
            try {
                this.currentPosition = i - 1;
                String strMonoploid = monoploid();
                this.currentPosition = i;
                if (Intrinsics.wireman(strMonoploid, "null")) {
                    gintrap("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.currentPosition = i;
                throw th;
            }
        }
        cord(this, saneness.attabal(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    public final void cuirassed(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        gintrap("Encountered an unknown key '" + key + '\'', StringsKt.underbelly(polder(0, this.currentPosition), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    public abstract byte cutely();

    public final int dern(CharSequence source, int startPos) {
        int i = startPos + 4;
        if (i < source.length()) {
            this.escapedString.append((char) ((stratoscope(source, startPos) << 12) + (stratoscope(source, startPos + 1) << 8) + (stratoscope(source, startPos + 2) << 4) + stratoscope(source, startPos + 3)));
            return i;
        }
        this.currentPosition = startPos;
        adultoid();
        if (this.currentPosition + 4 < source.length()) {
            return dern(source, this.currentPosition);
        }
        rotuma(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void dovishness() {
        if (cutely() == 10) {
            return;
        }
        rotuma(this, "Expected EOF after parsing, but had " + trm().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract void formularize(char expected);

    public final Void gintrap(String message, int position, String hint2) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint2, "hint");
        if (hint2.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint2;
        }
        throw preprohormone.beachfront(position, message + " at path: " + this.path.attabal() + str, trm());
    }

    public final void graveside() {
        this.peekedString = null;
    }

    public final boolean grimness() {
        int iMerc = merc();
        CharSequence charSequenceTrm = trm();
        if (iMerc >= charSequenceTrm.length() || iMerc == -1 || charSequenceTrm.charAt(iMerc) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final long impassible() {
        boolean z;
        boolean z2;
        int iSupplicat = supplicat(merc());
        if (iSupplicat >= trm().length() || iSupplicat == -1) {
            rotuma(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (trm().charAt(iSupplicat) == '\"') {
            iSupplicat++;
            if (iSupplicat == trm().length()) {
                rotuma(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        int i = iSupplicat;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        loop0: while (true) {
            z2 = false;
            while (true) {
                if (i == trm().length()) {
                    break loop0;
                }
                char cCharAt = trm().charAt(i);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z3) {
                    if (i == iSupplicat) {
                        rotuma(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                    z3 = true;
                } else if (cCharAt != '-' || !z3) {
                    if (cCharAt != '+' || !z3) {
                        if (cCharAt != '-') {
                            if (saneness.attabal(cCharAt) != 0) {
                                break loop0;
                            }
                            i++;
                            int i2 = cCharAt - '0';
                            if (i2 < 0 || i2 >= 10) {
                                rotuma(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z3) {
                                j2 = (j2 * ((long) 10)) + ((long) i2);
                            } else {
                                j = (j * ((long) 10)) - ((long) i2);
                                if (j > 0) {
                                    rotuma(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i != iSupplicat) {
                                rotuma(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i++;
                            z4 = true;
                        }
                    } else {
                        if (i == iSupplicat) {
                            rotuma(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i++;
                    }
                }
                z2 = true;
            }
            if (i == iSupplicat) {
                rotuma(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i++;
        }
        boolean z5 = i != iSupplicat;
        if (iSupplicat == i || (z4 && iSupplicat == i - 1)) {
            rotuma(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z) {
            if (!z5) {
                rotuma(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (trm().charAt(i) != '\"') {
                rotuma(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i++;
        }
        this.currentPosition = i;
        if (z3) {
            double dTriweekly = j * triweekly(j2, z2);
            if (dTriweekly > 9.223372036854776E18d || dTriweekly < -9.223372036854776E18d) {
                rotuma(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (Math.floor(dTriweekly) != dTriweekly) {
                rotuma(this, "Can't convert " + dTriweekly + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j = (long) dTriweekly;
        }
        if (z4) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        rotuma(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void impromptu(String literalSuffix, int current) {
        if (trm().length() - current < literalSuffix.length()) {
            rotuma(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length();
        for (int i = 0; i < length; i++) {
            if (literalSuffix.charAt(i) != (trm().charAt(current + i) | ' ')) {
                rotuma(this, "Expected valid boolean literal prefix, but had '" + monoploid() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = current + literalSuffix.length();
    }

    public final String kattegat(boolean isLenient) {
        String strKowloon;
        byte bSealless = sealless();
        if (isLenient) {
            if (bSealless != 1 && bSealless != 0) {
                return null;
            }
            strKowloon = monoploid();
        } else {
            if (bSealless != 1) {
                return null;
            }
            strKowloon = kowloon();
        }
        this.peekedString = strKowloon;
        return strKowloon;
    }

    public final String kowloon() {
        return this.peekedString != null ? seminary() : taiyuan();
    }

    public abstract boolean marial();

    public abstract int merc();

    public final String molybdenite(int lastPosition, int currentPosition) {
        wireman(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public final String monoploid() {
        if (this.peekedString != null) {
            return seminary();
        }
        int iMerc = merc();
        if (iMerc >= trm().length() || iMerc == -1) {
            rotuma(this, "EOF", iMerc, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bAttabal = saneness.attabal(trm().charAt(iMerc));
        if (bAttabal == 1) {
            return kowloon();
        }
        if (bAttabal != 0) {
            rotuma(this, "Expected beginning of the string, but got " + trm().charAt(iMerc), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z = false;
        while (saneness.attabal(trm().charAt(iMerc)) == 0) {
            iMerc++;
            if (iMerc >= trm().length()) {
                wireman(this.currentPosition, iMerc);
                int iSupplicat = supplicat(iMerc);
                if (iSupplicat == -1) {
                    this.currentPosition = iMerc;
                    return molybdenite(0, 0);
                }
                iMerc = iSupplicat;
                z = true;
            }
        }
        String strPolder = !z ? polder(this.currentPosition, iMerc) : molybdenite(this.currentPosition, iMerc);
        this.currentPosition = iMerc;
        return strPolder;
    }

    public final boolean oilcan(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public String polder(int startPos, int endPos) {
        return trm().subSequence(startPos, endPos).toString();
    }

    public final String polloi() {
        String strMonoploid = monoploid();
        if (!Intrinsics.wireman(strMonoploid, "null") || !starveling()) {
            return strMonoploid;
        }
        rotuma(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void preprohormone(byte expectedToken, boolean wasConsumed) {
        String strDern = saneness.dern(expectedToken);
        int i = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        rotuma(this, "Expected " + strDern + ", but had '" + ((this.currentPosition == trm().length() || i < 0) ? "EOF" : String.valueOf(trm().charAt(i))) + "' instead", i, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void restrictive(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bSealless = sealless();
        if (bSealless != 8 && bSealless != 6) {
            monoploid();
            return;
        }
        while (true) {
            byte bSealless2 = sealless();
            if (bSealless2 != 1) {
                if (bSealless2 == 8 || bSealless2 == 6) {
                    arrayList.add(Byte.valueOf(bSealless2));
                } else if (bSealless2 == 9) {
                    if (((Number) CollectionsKt.igbo(arrayList)).byteValue() != 8) {
                        throw preprohormone.beachfront(this.currentPosition, "found ] instead of } at path: " + this.path, trm());
                    }
                    p002kotlin.collections.cord.merc(arrayList);
                } else if (bSealless2 == 7) {
                    if (((Number) CollectionsKt.igbo(arrayList)).byteValue() != 6) {
                        throw preprohormone.beachfront(this.currentPosition, "found } instead of ] at path: " + this.path, trm());
                    }
                    p002kotlin.collections.cord.merc(arrayList);
                } else if (bSealless2 == 10) {
                    rotuma(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                cutely();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                monoploid();
            } else {
                taiyuan();
            }
        }
    }

    public final int saneness(int lastPosition, int current) {
        wireman(lastPosition, current);
        return attabal(current + 1);
    }

    public final boolean saran(boolean doConsume) {
        int iSupplicat = supplicat(merc());
        int length = trm().length() - iSupplicat;
        if (length < 4 || iSupplicat == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != trm().charAt(iSupplicat + i)) {
                return false;
            }
        }
        if (length > 4 && saneness.attabal(trm().charAt(iSupplicat + 4)) == 0) {
            return false;
        }
        if (!doConsume) {
            return true;
        }
        this.currentPosition = iSupplicat + 4;
        return true;
    }

    public byte sealless() {
        CharSequence charSequenceTrm = trm();
        int i = this.currentPosition;
        while (true) {
            int iSupplicat = supplicat(i);
            if (iSupplicat == -1) {
                this.currentPosition = iSupplicat;
                return (byte) 10;
            }
            char cCharAt = charSequenceTrm.charAt(iSupplicat);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.currentPosition = iSupplicat;
                return saneness.attabal(cCharAt);
            }
            i = iSupplicat + 1;
        }
    }

    public final String seminary() {
        String str = this.peekedString;
        Intrinsics.beachfront(str);
        this.peekedString = null;
        return str;
    }

    public final boolean starveling() {
        return trm().charAt(this.currentPosition - 1) != '\"';
    }

    public final int stratoscope(CharSequence source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        rotuma(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract int supplicat(int position);

    public abstract String taiyuan();

    public String toString() {
        return "JsonReader(source='" + ((Object) trm()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public abstract CharSequence trm();

    public void wireman(int fromIndex, int toIndex) {
        this.escapedString.append(trm(), fromIndex, toIndex);
    }

    public abstract String yemenite(String keyToMatch, boolean isLenient);

    public void adultoid() {
    }
}
