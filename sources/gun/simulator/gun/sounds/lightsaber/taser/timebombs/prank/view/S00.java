package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class S00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CC f3693a;

    static {
        new C4559sD().c();
    }

    public S00(C4559sD c4559sD) {
        CC cc;
        Collection collectionEntrySet = ((BC) c4559sD.f4968a).f3208a.entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            cc = C2760Sq.f;
        } else {
            C2594Mg<Map.Entry> c2594Mg = (C2594Mg) collectionEntrySet;
            EC ec = new EC(c2594Mg.size());
            int size = 0;
            for (Map.Entry entry : c2594Mg) {
                Object key = entry.getKey();
                AC acJ = AC.j((Collection) entry.getValue());
                if (!acJ.isEmpty()) {
                    ec.b(key, acJ);
                    size = acJ.size() + size;
                }
            }
            cc = new CC(ec.a(), size);
        }
        this.f3693a = cc;
    }

    public static String b(String str) {
        if (FW.C(str, HttpRequestHeader.Accept)) {
            return HttpRequestHeader.Accept;
        }
        if (FW.C(str, HttpResponseHeader.Allow)) {
            return HttpResponseHeader.Allow;
        }
        if (FW.C(str, HttpRequestHeader.Authorization)) {
            return HttpRequestHeader.Authorization;
        }
        if (FW.C(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (FW.C(str, "Blocksize")) {
            return "Blocksize";
        }
        if (FW.C(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (FW.C(str, "Connection")) {
            return "Connection";
        }
        if (FW.C(str, "Content-Base")) {
            return "Content-Base";
        }
        if (FW.C(str, HttpResponseHeader.ContentEncoding)) {
            return HttpResponseHeader.ContentEncoding;
        }
        if (FW.C(str, HttpResponseHeader.ContentLanguage)) {
            return HttpResponseHeader.ContentLanguage;
        }
        if (FW.C(str, "Content-Length")) {
            return "Content-Length";
        }
        if (FW.C(str, HttpResponseHeader.ContentLocation)) {
            return HttpResponseHeader.ContentLocation;
        }
        if (FW.C(str, "Content-Type")) {
            return "Content-Type";
        }
        if (FW.C(str, "CSeq")) {
            return "CSeq";
        }
        if (FW.C(str, "Date")) {
            return "Date";
        }
        if (FW.C(str, HttpResponseHeader.Expires)) {
            return HttpResponseHeader.Expires;
        }
        if (FW.C(str, HttpResponseHeader.Location)) {
            return HttpResponseHeader.Location;
        }
        if (FW.C(str, HttpResponseHeader.ProxyAuthenticate)) {
            return HttpResponseHeader.ProxyAuthenticate;
        }
        if (FW.C(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (FW.C(str, "Public")) {
            return "Public";
        }
        if (FW.C(str, "Range")) {
            return "Range";
        }
        if (FW.C(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (FW.C(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (FW.C(str, "Scale")) {
            return "Scale";
        }
        if (FW.C(str, "Session")) {
            return "Session";
        }
        if (FW.C(str, "Speed")) {
            return "Speed";
        }
        if (FW.C(str, "Supported")) {
            return "Supported";
        }
        if (FW.C(str, "Timestamp")) {
            return "Timestamp";
        }
        if (FW.C(str, "Transport")) {
            return "Transport";
        }
        if (FW.C(str, "User-Agent")) {
            return "User-Agent";
        }
        if (FW.C(str, "Via")) {
            return "Via";
        }
        return FW.C(str, HttpResponseHeader.WWWAuthenticate) ? HttpResponseHeader.WWWAuthenticate : str;
    }

    public final CC a() {
        return this.f3693a;
    }

    public final String c(String str) {
        AC acH = this.f3693a.h(b(str));
        if (acH.isEmpty()) {
            return null;
        }
        return (String) FW.H(acH);
    }

    public final AC d(String str) {
        return this.f3693a.h(b(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S00) {
            return this.f3693a.equals(((S00) obj).f3693a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3693a.hashCode();
    }
}
