package paddywack;

import com.ironsource.X3;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.cuirassed;
import okhttp3.formularize;
import okhttp3.graveside;
import okhttp3.impassible;
import okhttp3.molybdenite;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"Lokhttp3/molybdenite;", "", "headerName", "", "Lokhttp3/competently;", "attabal", "(Lokhttp3/molybdenite;Ljava/lang/String;)Ljava/util/List;", "Lduvetyn/wireman;", "", "result", "", "dern", "(Lduvetyn/wireman;Ljava/util/List;)V", "", "competently", "(Lduvetyn/wireman;)Z", "", "prefix", "impromptu", "(Lduvetyn/wireman;B)Z", "wireman", "(Lduvetyn/wireman;)Ljava/lang/String;", "marial", "Lokhttp3/impassible;", "Lokhttp3/graveside;", "url", "headers", "beachfront", "(Lokhttp3/impassible;Lokhttp3/graveside;Lokhttp3/molybdenite;)V", "Lokhttp3/cuirassed;", "saneness", "(Lokhttp3/cuirassed;)Z", "Lokio/ByteString;", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ByteString f35012attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ByteString f35013saneness;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f35012attabal = companion.wireman("\"\\");
        f35013saneness = companion.wireman("\t ,=");
    }

    public static final List<okhttp3.competently> attabal(molybdenite molybdeniteVar, String headerName) {
        Intrinsics.checkNotNullParameter(molybdeniteVar, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = molybdeniteVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dovishness.stratoscope(headerName, molybdeniteVar.wireman(i), true)) {
                try {
                    dern(new duvetyn.wireman().writeUtf8(molybdeniteVar.impromptu(i)), arrayList);
                } catch (EOFException e) {
                    elusion.impromptu.INSTANCE.competently().apical("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final void beachfront(impassible impassibleVar, graveside url, molybdenite headers) {
        Intrinsics.checkNotNullParameter(impassibleVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (impassibleVar == impassible.f34282saneness) {
            return;
        }
        List<formularize> listMarial = formularize.INSTANCE.marial(url, headers);
        if (listMarial.isEmpty()) {
            return;
        }
        impassibleVar.saneness(url, listMarial);
    }

    public static final boolean competently(duvetyn.wireman wiremanVar) throws EOFException {
        boolean z = false;
        while (!wiremanVar.exhausted()) {
            byte bCuirassed = wiremanVar.cuirassed(0L);
            if (bCuirassed == 44) {
                wiremanVar.readByte();
                z = true;
            } else {
                if (bCuirassed != 32 && bCuirassed != 9) {
                    break;
                }
                wiremanVar.readByte();
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x007b A[EDGE_INSN: B:59:0x007b->B:28:0x007b BREAK  A[LOOP:2: B:22:0x0068->B:49:0x00bb], SYNTHETIC] */
    public static final void dern(duvetyn.wireman wiremanVar, List<okhttp3.competently> list) throws EOFException {
        String strMarial;
        while (true) {
            String strMarial2 = null;
            while (true) {
                if (strMarial2 == null) {
                    competently(wiremanVar);
                    strMarial2 = marial(wiremanVar);
                    if (strMarial2 == null) {
                        return;
                    }
                }
                boolean zCompetently = competently(wiremanVar);
                String strMarial3 = marial(wiremanVar);
                if (strMarial3 == null) {
                    if (wiremanVar.exhausted()) {
                        list.add(new okhttp3.competently(strMarial2, seminary.taiyuan()));
                        return;
                    }
                    return;
                }
                int iSeminary = hereditist.wireman.seminary(wiremanVar, (byte) 61);
                boolean zCompetently2 = competently(wiremanVar);
                if (zCompetently || !(zCompetently2 || wiremanVar.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSeminary2 = iSeminary + hereditist.wireman.seminary(wiremanVar, (byte) 61);
                    while (true) {
                        if (strMarial3 == null) {
                            strMarial3 = marial(wiremanVar);
                            if (competently(wiremanVar)) {
                                break;
                            }
                            iSeminary2 = hereditist.wireman.seminary(wiremanVar, (byte) 61);
                            if (iSeminary2 == 0) {
                                break;
                            }
                            if (iSeminary2 <= 1 || competently(wiremanVar)) {
                                return;
                            }
                            if (impromptu(wiremanVar, (byte) 34)) {
                                strMarial = wireman(wiremanVar);
                            } else {
                                strMarial = marial(wiremanVar);
                            }
                            if (strMarial != null || ((String) linkedHashMap.put(strMarial3, strMarial)) != null) {
                                return;
                            }
                            if (competently(wiremanVar) && !wiremanVar.exhausted()) {
                                return;
                            } else {
                                strMarial3 = null;
                            }
                        } else {
                            if (iSeminary2 == 0) {
                                break;
                                break;
                            }
                            if (iSeminary2 <= 1) {
                                return;
                            }
                            if (impromptu(wiremanVar, (byte) 34)) {
                                strMarial = wireman(wiremanVar);
                            } else {
                                strMarial = marial(wiremanVar);
                            }
                            if (strMarial != null) {
                                return;
                            }
                            if (competently(wiremanVar)) {
                            }
                            strMarial3 = null;
                        }
                    }
                    list.add(new okhttp3.competently(strMarial2, linkedHashMap));
                    strMarial2 = strMarial3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, Intrinsics.arytenoidectomy(strMarial3, dovishness.kattegat(X3.j.b, iSeminary)));
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new okhttp3.competently(strMarial2, mapSingletonMap));
                }
            }
        }
    }

    public static final boolean impromptu(duvetyn.wireman wiremanVar, byte b) {
        return !wiremanVar.exhausted() && wiremanVar.cuirassed(0L) == b;
    }

    public static final String marial(duvetyn.wireman wiremanVar) {
        long jGintrap = wiremanVar.gintrap(f35013saneness);
        if (jGintrap == -1) {
            jGintrap = wiremanVar.getSize();
        }
        if (jGintrap != 0) {
            return wiremanVar.readUtf8(jGintrap);
        }
        return null;
    }

    public static final boolean saneness(cuirassed cuirassedVar) {
        Intrinsics.checkNotNullParameter(cuirassedVar, "<this>");
        if (Intrinsics.wireman(cuirassedVar.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getMethod(), "HEAD")) {
            return false;
        }
        int code = cuirassedVar.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && hereditist.wireman.dovishness(cuirassedVar) == -1 && !dovishness.stratoscope("chunked", cuirassed.rotuma(cuirassedVar, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    public static final String wireman(duvetyn.wireman wiremanVar) throws EOFException {
        if (wiremanVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        duvetyn.wireman wiremanVar2 = new duvetyn.wireman();
        while (true) {
            long jGintrap = wiremanVar.gintrap(f35012attabal);
            if (jGintrap == -1) {
                return null;
            }
            if (wiremanVar.cuirassed(jGintrap) == 34) {
                wiremanVar2.supplicat(wiremanVar, jGintrap);
                wiremanVar.readByte();
                return wiremanVar2.readUtf8();
            }
            if (wiremanVar.getSize() == jGintrap + 1) {
                return null;
            }
            wiremanVar2.supplicat(wiremanVar, jGintrap);
            wiremanVar.readByte();
            wiremanVar2.supplicat(wiremanVar, 1L);
        }
    }
}
