package okio.internal;

import duvetyn.cord;
import java.io.EOFException;
import java.util.ArrayList;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u001b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001e\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\"\u001a\u0010!\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b \u0010\u001d\"\u001a\u0010$\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u0012\u0004\b#\u0010\u001d\"\u001a\u0010'\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u0012\u0004\b&\u0010\u001d\"\u001a\u0010*\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u0012\u0004\b)\u0010\u001d\"\u0018\u0010,\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lduvetyn/cord;", "", "kowloon", "(Lduvetyn/cord;)I", "", "triweekly", "(Lduvetyn/cord;)Z", "child", "normalize", "cutely", "(Lduvetyn/cord;Lduvetyn/cord;Z)Lduvetyn/cord;", "", "apical", "(Ljava/lang/String;Z)Lduvetyn/cord;", "Lduvetyn/wireman;", "monoploid", "(Lduvetyn/wireman;Z)Lduvetyn/cord;", "Lokio/ByteString;", "molybdenite", "(Ljava/lang/String;)Lokio/ByteString;", "", "polloi", "(B)Lokio/ByteString;", "slash", "arytenoidectomy", "(Lduvetyn/wireman;Lokio/ByteString;)Z", "attabal", "Lokio/ByteString;", "getSLASH$annotations", "()V", "SLASH", "saneness", "getBACKSLASH$annotations", "BACKSLASH", "dern", "getANY_SLASH$annotations", "ANY_SLASH", "wireman", "getDOT$annotations", "DOT", "marial", "getDOT_DOT$annotations", "DOT_DOT", "formularize", "indexOfLastSlash", "impassible", "(Lduvetyn/cord;)Lokio/ByteString;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ByteString f34755attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final ByteString f34756dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ByteString f34757marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ByteString f34758saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final ByteString f34759wireman;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f34755attabal = companion.wireman("/");
        f34758saneness = companion.wireman("\\");
        f34756dern = companion.wireman("/\\");
        f34759wireman = companion.wireman(".");
        f34757marial = companion.wireman("..");
    }

    public static final cord apical(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return monoploid(new duvetyn.wireman().writeUtf8(str), z);
    }

    public static final boolean arytenoidectomy(duvetyn.wireman wiremanVar, ByteString byteString) {
        if (!Intrinsics.wireman(byteString, f34758saneness) || wiremanVar.getSize() < 2 || wiremanVar.cuirassed(1L) != 58) {
            return false;
        }
        char cCuirassed = (char) wiremanVar.cuirassed(0L);
        if ('a' > cCuirassed || cCuirassed >= '{') {
            return 'A' <= cCuirassed && cCuirassed < '[';
        }
        return true;
    }

    public static final cord cutely(cord cordVar, cord child, boolean z) {
        Intrinsics.checkNotNullParameter(cordVar, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.monoploid() != null) {
            return child;
        }
        ByteString byteStringImpassible = impassible(cordVar);
        if (byteStringImpassible == null && (byteStringImpassible = impassible(child)) == null) {
            byteStringImpassible = molybdenite(cord.f25397monoploid);
        }
        duvetyn.wireman wiremanVar = new duvetyn.wireman();
        wiremanVar.sensatory(cordVar.getBytes());
        if (wiremanVar.getSize() > 0) {
            wiremanVar.sensatory(byteStringImpassible);
        }
        wiremanVar.sensatory(child.getBytes());
        return monoploid(wiremanVar, z);
    }

    public static final int formularize(cord cordVar) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(cordVar.getBytes(), f34755attabal, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(cordVar.getBytes(), f34758saneness, 0, 2, (Object) null);
    }

    public static final ByteString impassible(cord cordVar) {
        ByteString byteStringDern = cordVar.getBytes();
        ByteString byteString = f34755attabal;
        if (ByteString.indexOf$default(byteStringDern, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString byteStringDern2 = cordVar.getBytes();
        ByteString byteString2 = f34758saneness;
        if (ByteString.indexOf$default(byteStringDern2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final int kowloon(cord cordVar) {
        if (cordVar.getBytes().size() == 0) {
            return -1;
        }
        if (cordVar.getBytes().getByte(0) == 47) {
            return 1;
        }
        if (cordVar.getBytes().getByte(0) == 92) {
            if (cordVar.getBytes().size() <= 2 || cordVar.getBytes().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = cordVar.getBytes().indexOf(f34758saneness, 2);
            return iIndexOf == -1 ? cordVar.getBytes().size() : iIndexOf;
        }
        if (cordVar.getBytes().size() > 2 && cordVar.getBytes().getByte(1) == 58 && cordVar.getBytes().getByte(2) == 92) {
            char c = (char) cordVar.getBytes().getByte(0);
            if ('a' <= c && c < '{') {
                return 3;
            }
            if ('A' <= c && c < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final ByteString molybdenite(String str) {
        if (Intrinsics.wireman(str, "/")) {
            return f34755attabal;
        }
        if (Intrinsics.wireman(str, "\\")) {
            return f34758saneness;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final cord monoploid(duvetyn.wireman wiremanVar, boolean z) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        duvetyn.wireman wiremanVar2 = new duvetyn.wireman();
        ByteString byteStringPolloi = null;
        int i = 0;
        while (true) {
            if (!wiremanVar.trm(0L, f34755attabal)) {
                byteString = f34758saneness;
                if (!wiremanVar.trm(0L, byteString)) {
                    break;
                }
            }
            byte b = wiremanVar.readByte();
            if (byteStringPolloi == null) {
                byteStringPolloi = polloi(b);
            }
            i++;
        }
        boolean z2 = i >= 2 && Intrinsics.wireman(byteStringPolloi, byteString);
        if (z2) {
            Intrinsics.beachfront(byteStringPolloi);
            wiremanVar2.sensatory(byteStringPolloi);
            wiremanVar2.sensatory(byteStringPolloi);
        } else if (i > 0) {
            Intrinsics.beachfront(byteStringPolloi);
            wiremanVar2.sensatory(byteStringPolloi);
        } else {
            long jGintrap = wiremanVar.gintrap(f34756dern);
            if (byteStringPolloi == null) {
                byteStringPolloi = jGintrap == -1 ? molybdenite(cord.f25397monoploid) : polloi(wiremanVar.cuirassed(jGintrap));
            }
            if (arytenoidectomy(wiremanVar, byteStringPolloi)) {
                if (jGintrap == 2) {
                    wiremanVar2.supplicat(wiremanVar, 3L);
                } else {
                    wiremanVar2.supplicat(wiremanVar, 2L);
                }
            }
        }
        boolean z3 = wiremanVar2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!wiremanVar.exhausted()) {
            long jGintrap2 = wiremanVar.gintrap(f34756dern);
            if (jGintrap2 == -1) {
                byteString2 = wiremanVar.readByteString();
            } else {
                byteString2 = wiremanVar.readByteString(jGintrap2);
                wiremanVar.readByte();
            }
            ByteString byteString3 = f34757marial;
            if (Intrinsics.wireman(byteString2, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.wireman(CollectionsKt.igbo(arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z2 || arrayList.size() != 1) {
                        p002kotlin.collections.cord.polder(arrayList);
                    }
                }
            } else if (!Intrinsics.wireman(byteString2, f34759wireman) && !Intrinsics.wireman(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                wiremanVar2.sensatory(byteStringPolloi);
            }
            wiremanVar2.sensatory((ByteString) arrayList.get(i2));
        }
        if (wiremanVar2.getSize() == 0) {
            wiremanVar2.sensatory(f34759wireman);
        }
        return new cord(wiremanVar2.readByteString());
    }

    public static final ByteString polloi(byte b) {
        if (b == 47) {
            return f34755attabal;
        }
        if (b == 92) {
            return f34758saneness;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    public static final boolean triweekly(cord cordVar) {
        return cordVar.getBytes().endsWith(f34757marial) && (cordVar.getBytes().size() == 2 || cordVar.getBytes().rangeEquals(cordVar.getBytes().size() + (-3), f34755attabal, 0, 1) || cordVar.getBytes().rangeEquals(cordVar.getBytes().size() + (-3), f34758saneness, 0, 1));
    }
}
