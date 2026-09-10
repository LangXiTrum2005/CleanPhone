package p002kotlin.text;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.graveside;
import patroclinal.impassible;
import patroclinal.kowloon;
import patroclinal.monoploid;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "Lpatroclinal/impassible;", "attabal", "(Ljava/lang/String;)B", "Lpatroclinal/graveside;", "cutely", "(Ljava/lang/String;)S", "Lpatroclinal/kowloon;", "wireman", "(Ljava/lang/String;)I", "Lpatroclinal/monoploid;", "competently", "(Ljava/lang/String;)J", "saneness", "(Ljava/lang/String;)Lpatroclinal/impassible;", "", "radix", "dern", "(Ljava/lang/String;I)Lpatroclinal/impassible;", "apical", "(Ljava/lang/String;)Lpatroclinal/graveside;", "formularize", "(Ljava/lang/String;I)Lpatroclinal/graveside;", "marial", "(Ljava/lang/String;)Lpatroclinal/kowloon;", "beachfront", "(Ljava/lang/String;I)Lpatroclinal/kowloon;", "impromptu", "(Ljava/lang/String;)Lpatroclinal/monoploid;", "taiyuan", "(Ljava/lang/String;I)Lpatroclinal/monoploid;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class oilcan {
    public static final graveside apical(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return formularize(str, 10);
    }

    public static final byte attabal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        impassible impassibleVarSaneness = saneness(str);
        if (impassibleVarSaneness != null) {
            return impassibleVarSaneness.getData();
        }
        StringsKt__StringNumberConversionsKt.polloi(str);
        throw new KotlinNothingValueException();
    }

    public static final kowloon beachfront(String str, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.taiyuan(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iDern = kowloon.dern(i);
        int iAttabal = 119304647;
        while (i2 < length) {
            int iAttabal2 = CharsKt__CharJVMKt.attabal(str.charAt(i2), i);
            if (iAttabal2 < 0) {
                return null;
            }
            if (Integer.compare(i3 ^ Integer.MIN_VALUE, iAttabal ^ Integer.MIN_VALUE) > 0) {
                if (iAttabal == 119304647) {
                    iAttabal = trm.attabal(-1, iDern);
                    if (Integer.compare(i3 ^ Integer.MIN_VALUE, iAttabal ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iDern2 = kowloon.dern(i3 * iDern);
            int iDern3 = kowloon.dern(kowloon.dern(iAttabal2) + iDern2);
            if (Integer.compare(iDern3 ^ Integer.MIN_VALUE, iDern2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = iDern3;
        }
        return kowloon.attabal(i3);
    }

    public static final long competently(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        monoploid monoploidVarImpromptu = impromptu(str);
        if (monoploidVarImpromptu != null) {
            return monoploidVarImpromptu.getData();
        }
        StringsKt__StringNumberConversionsKt.polloi(str);
        throw new KotlinNothingValueException();
    }

    public static final short cutely(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        graveside gravesideVarApical = apical(str);
        if (gravesideVarApical != null) {
            return gravesideVarApical.getData();
        }
        StringsKt__StringNumberConversionsKt.polloi(str);
        throw new KotlinNothingValueException();
    }

    public static final impassible dern(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        kowloon kowloonVarBeachfront = beachfront(str, i);
        if (kowloonVarBeachfront == null) {
            return null;
        }
        int data = kowloonVarBeachfront.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, kowloon.dern(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return impassible.attabal(impassible.dern((byte) data));
    }

    public static final graveside formularize(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        kowloon kowloonVarBeachfront = beachfront(str, i);
        if (kowloonVarBeachfront == null) {
            return null;
        }
        int data = kowloonVarBeachfront.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, kowloon.dern(Settings.DEFAULT_INITIAL_WINDOW_SIZE) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return graveside.attabal(graveside.dern((short) data));
    }

    public static final monoploid impromptu(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return taiyuan(str, 10);
    }

    public static final kowloon marial(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return beachfront(str, 10);
    }

    public static final impassible saneness(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return dern(str, 10);
    }

    public static final monoploid taiyuan(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.taiyuan(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jDern = monoploid.dern(i);
        long j = 0;
        long jAttabal = 512409557603043100L;
        while (i2 < length) {
            int iAttabal = CharsKt__CharJVMKt.attabal(str.charAt(i2), i);
            if (iAttabal < 0) {
                return null;
            }
            if (Long.compare(j ^ Long.MIN_VALUE, jAttabal ^ Long.MIN_VALUE) > 0) {
                if (jAttabal == 512409557603043100L) {
                    jAttabal = cuirassed.attabal(-1L, jDern);
                    if (Long.compare(j ^ Long.MIN_VALUE, jAttabal ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jDern2 = monoploid.dern(j * jDern);
            long jDern3 = monoploid.dern(monoploid.dern(((long) kowloon.dern(iAttabal)) & 4294967295L) + jDern2);
            if (Long.compare(jDern3 ^ Long.MIN_VALUE, jDern2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = jDern3;
        }
        return monoploid.attabal(j);
    }

    public static final int wireman(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        kowloon kowloonVarMarial = marial(str);
        if (kowloonVarMarial != null) {
            return kowloonVarMarial.getData();
        }
        StringsKt__StringNumberConversionsKt.polloi(str);
        throw new KotlinNothingValueException();
    }
}
