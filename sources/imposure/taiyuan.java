package imposure;

import com.google.common.base.formularize;
import com.google.common.base.triweekly;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.achondroplasia;
import com.google.common.util.concurrent.trm;
import com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import duvetyn.adultoid;
import duvetyn.supplicat;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.annotation.Nullable;
import okhttp3.Protocol;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.preprohormone;
import okhttp3.stratoscope;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ImmutableSet f28499attabal = ImmutableSet.of(TtmlNode.TAG_BR, "deflate", "gzip", "x-gzip");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final triweekly f28500saneness = triweekly.competently(',').formularize().beachfront();

    public static Protocol attabal(String str) {
        if (str.contains("quic")) {
            return Protocol.QUIC;
        }
        if (str.contains("h3")) {
            return Protocol.QUIC;
        }
        if (str.contains("spdy")) {
            return Protocol.HTTP_2;
        }
        if (str.contains("h2")) {
            return Protocol.HTTP_2;
        }
        return str.contains("http/1.1") ? Protocol.HTTP_1_1 : Protocol.HTTP_1_0;
    }

    public static Object beachfront(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return obj3 == null ? formularize.triweekly(obj2) : obj3;
    }

    public static stratoscope dern(preprohormone preprohormoneVar, int i, @Nullable String str, @Nullable String str2, supplicat supplicatVar) throws IOException {
        long j;
        if (preprohormoneVar.getMethod().equals("HEAD")) {
            j = 0;
        } else {
            j = -1;
            if (str2 != null) {
                try {
                    j = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if ((i != 204 && i != 205) || j <= 0) {
            return stratoscope.create(str != null ? dovishness.competently(str) : null, j, adultoid.wireman(supplicatVar));
        }
        StringBuilder sb = new StringBuilder("HTTP ".length() + String.valueOf(i).length() + " had non-zero Content-Length: ".length() + String.valueOf(str2).length());
        sb.append("HTTP ");
        sb.append(i);
        sb.append(" had non-zero Content-Length: ");
        sb.append(str2);
        throw new ProtocolException(sb.toString());
    }

    @Nullable
    public static String marial(String str, UrlResponseInfo urlResponseInfo) {
        List<String> list = urlResponseInfo.getAllHeaders().get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) achondroplasia.beachfront(list);
    }

    public static cuirassed.attabal saneness(preprohormone preprohormoneVar, UrlResponseInfo urlResponseInfo, @Nullable supplicat supplicatVar) throws IOException {
        cuirassed.attabal attabalVar = new cuirassed.attabal();
        String strMarial = marial("Content-Type", urlResponseInfo);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) beachfront(urlResponseInfo.getAllHeaders(), "Content-Encoding", Collections.EMPTY_LIST)).iterator();
        while (it.hasNext()) {
            achondroplasia.attabal(arrayList, f28500saneness.taiyuan((String) it.next()));
        }
        boolean z = true;
        if (!arrayList.isEmpty() && f28499attabal.containsAll(arrayList)) {
            z = false;
        }
        attabalVar.molybdenite(preprohormoneVar).competently(urlResponseInfo.getHttpStatusCode()).triweekly(urlResponseInfo.getHttpStatusText()).monoploid(attabal(urlResponseInfo.getNegotiatedProtocol())).saneness(supplicatVar != null ? dern(preprohormoneVar, urlResponseInfo.getHttpStatusCode(), strMarial, z ? marial("Content-Length", urlResponseInfo) : null, supplicatVar) : null);
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (z || (!com.google.common.base.attabal.attabal(entry.getKey(), "Content-Length") && !com.google.common.base.attabal.attabal(entry.getKey(), "Content-Encoding"))) {
                attabalVar.attabal(entry.getKey(), entry.getValue());
            }
        }
        return attabalVar;
    }

    public static Object wireman(Future future) throws IOException {
        try {
            return trm.attabal(future);
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    public cuirassed competently(preprohormone preprohormoneVar, OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) throws IOException {
        UrlResponseInfo urlResponseInfo = (UrlResponseInfo) wireman(okHttpBridgeRequestCallback.competently());
        cuirassed.attabal attabalVarSaneness = saneness(preprohormoneVar, urlResponseInfo, (supplicat) wireman(okHttpBridgeRequestCallback.beachfront()));
        List listImpromptu = okHttpBridgeRequestCallback.impromptu();
        List<String> urlChain = urlResponseInfo.getUrlChain();
        if (!listImpromptu.isEmpty()) {
            formularize.marial(urlChain.size() == listImpromptu.size() + 1, "The number of redirects should be consistent across URLs and headers!");
            cuirassed cuirassedVarDern = null;
            for (int i = 0; i < listImpromptu.size(); i++) {
                cuirassedVarDern = saneness(preprohormoneVar.taiyuan().graveside(urlChain.get(i)).saneness(), (UrlResponseInfo) listImpromptu.get(i), null).arytenoidectomy(cuirassedVarDern).dern();
            }
            attabalVarSaneness.molybdenite(preprohormoneVar.taiyuan().graveside((String) achondroplasia.beachfront(urlChain)).saneness()).arytenoidectomy(cuirassedVarDern);
        }
        return attabalVarSaneness.dern();
    }
}
