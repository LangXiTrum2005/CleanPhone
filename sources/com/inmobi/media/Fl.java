package com.inmobi.media;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdSize;
import com.inmobi.media.Fl;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3764u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import p002kotlin.jvm.internal.Ref$IntRef;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import patroclinal.formularize;

/* JADX INFO: loaded from: classes3.dex */
public final class Fl {
    public final AdConfig.VastVideoConfig a;
    public final C3109nl b;
    public final C3097n9 c;
    public int d;
    public boolean e;
    public String f;
    public String g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public String k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;

    public Fl(AdConfig.VastVideoConfig vastVideoConfig, C3109nl vastEventProcessor, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(vastEventProcessor, "vastEventProcessor");
        this.a = vastVideoConfig;
        this.b = vastEventProcessor;
        this.c = c3097n9;
        this.f = "";
        this.g = "";
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = "";
        this.k = "";
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(Fl fl, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws C3258tl {
        C3333wl c3333wl;
        String string;
        Ref$BooleanRef ref$BooleanRef;
        fl.getClass();
        if (continuationImpl instanceof C3333wl) {
            c3333wl = (C3333wl) continuationImpl;
            int i = c3333wl.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3333wl.d = i - Integer.MIN_VALUE;
            } else {
                c3333wl = new C3333wl(fl, continuationImpl);
            }
        } else {
            c3333wl = new C3333wl(fl, continuationImpl);
        }
        Object obj = c3333wl.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3333wl.d;
        if (i2 == 0) {
            dern.saneness(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            try {
                string = xmlPullParser.getAttributeValue(null, "adType").toString();
            } catch (Exception unused) {
                string = "video";
            }
            if (!Intrinsics.wireman(string, "video")) {
                throw new C3258tl((short) 1125);
            }
            Function1 c3358xl = new C3358xl(fl, null, ref$BooleanRef2, xmlPullParser);
            c3333wl.a = ref$BooleanRef2;
            c3333wl.d = 1;
            if (fl.a(xmlPullParser, "Ad", c3358xl, c3333wl) == objBeachfront) {
                return objBeachfront;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = c3333wl.a;
            dern.saneness(obj);
        }
        if (ref$BooleanRef.element) {
            return Unit.f29295attabal;
        }
        throw new C3258tl((short) 1101);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(Fl fl, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws C3258tl {
        Al al;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        fl.getClass();
        if (continuationImpl instanceof Al) {
            al = (Al) continuationImpl;
            int i = al.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                al.e = i - Integer.MIN_VALUE;
            } else {
                al = new Al(fl, continuationImpl);
            }
        } else {
            al = new Al(fl, continuationImpl);
        }
        Object obj = al.c;
        Object objBeachfront = attabal.beachfront();
        int i2 = al.e;
        if (i2 == 0) {
            dern.saneness(obj);
            Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
            Ref$BooleanRef ref$BooleanRef4 = new Ref$BooleanRef();
            Function1 bl = new Bl(xmlPullParser, fl, ref$BooleanRef4, ref$BooleanRef3, null);
            al.a = ref$BooleanRef3;
            al.b = ref$BooleanRef4;
            al.e = 1;
            if (fl.a(xmlPullParser, "VAST", bl, al) == objBeachfront) {
                return objBeachfront;
            }
            ref$BooleanRef = ref$BooleanRef4;
            ref$BooleanRef2 = ref$BooleanRef3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = al.b;
            ref$BooleanRef2 = al.a;
            dern.saneness(obj);
        }
        if (ref$BooleanRef2.element) {
            return Unit.f29295attabal;
        }
        if (ref$BooleanRef.element) {
            throw new C3258tl((short) 1124);
        }
        throw new C3258tl((short) 1102);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(Fl fl, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws C3258tl {
        Dl dl;
        Ref$BooleanRef ref$BooleanRef;
        fl.getClass();
        if (continuationImpl instanceof Dl) {
            dl = (Dl) continuationImpl;
            int i = dl.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dl.d = i - Integer.MIN_VALUE;
            } else {
                dl = new Dl(fl, continuationImpl);
            }
        } else {
            dl = new Dl(fl, continuationImpl);
        }
        Object obj = dl.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = dl.d;
        if (i2 == 0) {
            dern.saneness(obj);
            int i3 = fl.d + 1;
            fl.d = i3;
            if (i3 > fl.a.getMaxWrapperLimit()) {
                throw new C3258tl((short) 1107);
            }
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            Function1 el = new El(fl, null, ref$BooleanRef2, xmlPullParser);
            dl.a = ref$BooleanRef2;
            dl.d = 1;
            if (fl.a(xmlPullParser, "Wrapper", el, dl) == objBeachfront) {
                return objBeachfront;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = dl.a;
            dern.saneness(obj);
        }
        if (ref$BooleanRef.element) {
            return Unit.f29295attabal;
        }
        throw new C3258tl((short) 1121);
    }

    public static final Unit d(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.wireman(name, "CompanionClickTracking")) {
            String strB = AbstractC3134ol.b(fl.v(xmlPullParser));
            if (!AbstractC3134ol.a(strB)) {
                strB = null;
            }
            C3301ve c3301ve = strB != null ? new C3301ve(strB, "click") : null;
            if (c3301ve != null) {
                fl.m.add(c3301ve);
            }
        } else if (Intrinsics.wireman(name, "TrackingEvents")) {
            fl.m.addAll(fl.o(xmlPullParser));
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public static final Unit e(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.wireman(xmlPullParser.getName(), "Companion")) {
            fl.q(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public static final Unit h(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.wireman(name, "TrackingEvents")) {
            fl.i.addAll(fl.o(xmlPullParser));
        } else if (Intrinsics.wireman(name, "VideoClicks")) {
            fl.a(xmlPullParser, false);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public final void f(XmlPullParser xmlPullParser) {
        String strB = AbstractC3134ol.b(v(xmlPullParser));
        if (strB.length() != 0) {
            if (!AbstractC3134ol.a(strB)) {
                strB = null;
            }
            if (strB == null) {
                return;
            }
            this.i.add(new C3301ve(strB, "Impression"));
            return;
        }
        C3097n9 c3097n9 = this.c;
        if (c3097n9 != null) {
            c3097n9.b("VastParser", "Vast Tracker Error: Impression");
        }
    }

    public final void g(final XmlPullParser xmlPullParser) throws C3258tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, "InLine", new Function0() { // from class: adsuki.clubfoot
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3258tl((short) 1122);
        }
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        a(xmlPullParser, "CompanionAds", new Function0() { // from class: adsuki.hydrovane
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$IntRef);
            }
        });
        if (this.n.size() != 0) {
            if (this.e) {
                C3097n9 c3097n9 = this.c;
                if (c3097n9 != null) {
                    c3097n9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map mapA = AbstractC2983ik.a(this.b.a);
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1152);
                Wj wj = Wj.a;
                Wj.b("VastParseEvent", mapA, EnumC2779ak.SDK);
                return;
            }
            return;
        }
        if (this.e) {
            HashMap map = new HashMap();
            map.put("[ERRORCODE]", String.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED));
            map.put("[ADSERVINGID]", this.g);
            map.put("[UNIVERSALADID]", this.f);
            C3109nl.a(map, this.i, this.c);
            Map mapA2 = AbstractC2983ik.a(this.b.a);
            mapA2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1150);
            Wj wj2 = Wj.a;
            Wj.b("VastParseEvent", mapA2, EnumC2779ak.SDK);
            return;
        }
        if (ref$IntRef.element > 0) {
            HashMap map2 = new HashMap();
            map2.put("[ERRORCODE]", String.valueOf(600));
            map2.put("[ADSERVINGID]", this.g);
            map2.put("[UNIVERSALADID]", this.f);
            C3109nl.a(map2, this.i, this.c);
            Map mapA3 = AbstractC2983ik.a(this.b.a);
            mapA3.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1151);
            Wj wj3 = Wj.a;
            Wj.b("VastParseEvent", mapA3, EnumC2779ak.SDK);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, "Creative", new Function0() { // from class: adsuki.splinterproof
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.b(xmlPullParser, this, ref$BooleanRef);
            }
        });
        return ref$BooleanRef.element;
    }

    public final void k(final XmlPullParser xmlPullParser) throws C3258tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, "Creatives", new Function0() { // from class: adsuki.privatdozent
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3258tl((short) 1112);
        }
        if (!ref$BooleanRef2.element) {
            throw new C3258tl((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) throws C3258tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, "Linear", new Function0() { // from class: adsuki.overspeculate
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3258tl((short) 1116);
        }
        if (!ref$BooleanRef2.element) {
            throw new C3258tl((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) throws C3258tl {
        final ArrayList arrayList = new ArrayList();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, "MediaFiles", new Function0() { // from class: adsuki.saran
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef2, ref$BooleanRef, arrayList);
            }
        });
        if (!ref$BooleanRef2.element) {
            throw new C3258tl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new C3258tl((short) 1119);
        }
        if (ref$BooleanRef.element) {
            Map mapA = AbstractC2983ik.a(this.b.a);
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1153);
            Wj wj = Wj.a;
            Wj.b("VastParseEvent", mapA, EnumC2779ak.SDK);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C3097n9 c3097n9 = this.c;
            if (c3097n9 == null) {
                return -1;
            }
            c3097n9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C3097n9 c3097n10 = this.c;
            if (c3097n10 == null) {
                return -1;
            }
            c3097n10.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "TrackingEvents", new Function0() { // from class: adsuki.restrictive
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            C3097n9 c3097n9 = this.c;
            if (c3097n9 != null) {
                c3097n9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "Verification", new Function0() { // from class: adsuki.peridotite
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$ObjectRef, ref$ObjectRef2, arrayList);
            }
        });
        if (!ref$BooleanRef.element) {
            HashMap map = new HashMap();
            map.put("[REASON]", String.valueOf(2));
            map.put("[ADSERVINGID]", this.g);
            map.put("[UNIVERSALADID]", this.f);
            C3109nl.a(map, arrayList, this.c);
            return;
        }
        if (!AbstractC3134ol.a((String) ref$ObjectRef.element)) {
            HashMap map2 = new HashMap();
            map2.put("[REASON]", String.valueOf(3));
            map2.put("[ADSERVINGID]", this.g);
            map2.put("[UNIVERSALADID]", this.f);
            C3109nl.a(map2, arrayList, this.c);
            return;
        }
        this.i.add(new C3402zf(attributeValue, (String) ref$ObjectRef2.element, (String) ref$ObjectRef.element));
        C3097n9 c3097n10 = this.c;
        if (c3097n10 != null) {
            c3097n10.a("VastParser", "OMID ADVerification URL : " + ref$ObjectRef.element);
        }
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Companion", new Function0() { // from class: adsuki.polder
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "CompanionAds", new Function0() { // from class: adsuki.creditor
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creative", new Function0() { // from class: adsuki.starveling
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creatives", new Function0() { // from class: adsuki.seminary
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Linear", new Function0() { // from class: adsuki.mathsort
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.h(xmlPullParser, this);
            }
        });
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int iN = n(xmlPullParser);
        if ((iN == 4 || iN == 5) && (text = xmlPullParser.getText()) != null && F3.a(text)) {
            return text;
        }
        return null;
    }

    public static final Unit g(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.wireman(xmlPullParser.getName(), "Creative")) {
            fl.s(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public static final Unit f(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.wireman(name, "Linear")) {
            fl.u(xmlPullParser);
        } else if (Intrinsics.wireman(name, "CompanionAds")) {
            fl.r(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extensions", new Function0() { // from class: adsuki.kattegat
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.c(xmlPullParser, this);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        a(xmlPullParser, "Companion", new Function0() { // from class: adsuki.grimness
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList, ref$ObjectRef, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            C3097n9 c3097n9 = this.c;
            if (c3097n9 != null) {
                c3097n9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.n.add(new C3084ml(arrayList, arrayList2, this.m));
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extension", new Function0() { // from class: adsuki.walach
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.b(xmlPullParser, this);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    public static final Unit b(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef) throws XmlPullParserException, C3258tl, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -2018804923) {
                if (iHashCode != 1150879268) {
                    if (iHashCode == 1539775849 && name.equals("UniversalAdId")) {
                        String strV = fl.v(xmlPullParser);
                        if (strV == null) {
                            strV = "";
                        }
                        fl.f = strV;
                    } else {
                        fl.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("CompanionAds")) {
                    fl.i(xmlPullParser);
                } else {
                    fl.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("Linear")) {
                ref$BooleanRef.element = true;
                fl.l(xmlPullParser);
            } else {
                fl.getClass();
                w(xmlPullParser);
            }
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.inmobi.media.Fl] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    public final Object a(String str, ArrayList urls, ContinuationImpl continuationImpl) throws C3258tl {
        C3308vl c3308vl;
        int i;
        if (continuationImpl instanceof C3308vl) {
            c3308vl = (C3308vl) continuationImpl;
            int i2 = c3308vl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3308vl.d = i2 - Integer.MIN_VALUE;
            } else {
                c3308vl = new C3308vl(this, continuationImpl);
            }
        } else {
            c3308vl = new C3308vl(this, continuationImpl);
        }
        Object obj = c3308vl.b;
        Object objBeachfront = attabal.beachfront();
        int i3 = c3308vl.d;
        try {
            if (i3 == 0) {
                dern.saneness(obj);
                c3308vl.a = urls;
                c3308vl.d = 1;
                urls = urls;
                if (a(str, c3308vl) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = c3308vl.a;
                dern.saneness(obj);
                urls = list;
            }
            return new C3184ql(this.f, this.g, this.i, this.j, this.k, this.n, this.l);
        } catch (C3258tl e) {
            short s = e.a;
            if (s == 1100 || s == 1102) {
                i = 303;
            } else if (s == 1101 || s == 1124 || s == 1125 || s == 1103 || s == 1120 || s == 1121 || s == 1123 || s == 1122 || s == 1112 || s == 1109 || s == 1115 || s == 1116 || s == 1117) {
                i = 101;
            } else if (s == 1104) {
                i = 100;
            } else if (s == 1105 || s == 1106) {
                i = 900;
            } else if (s == 1107) {
                i = 302;
            } else if (s == 1108 || s == 1114) {
                i = AdSize.MEDIUM_RECTANGLE_WIDTH;
            } else if (s == 1111) {
                i = 201;
            } else if (s == 1113) {
                i = 301;
            } else if (s == 1118) {
                i = 401;
            } else {
                i = s == 1119 ? 403 : 0;
            }
            HashMap macros = seminary.apical(formularize.attabal("[ERRORCODE]", String.valueOf(i)), formularize.attabal("[ADSERVINGID]", this.g), formularize.attabal("[UNIVERSALADID]", this.f));
            short s2 = e.a;
            if (s2 != 1102 && s2 != 1124) {
                C3109nl.a(macros, this.i, this.c);
            } else {
                C3109nl.a(macros, CollectionsKt.unconsolidated(this.h, this.i), this.c);
            }
            C3097n9 c3097n9 = this.c;
            Intrinsics.checkNotNullParameter(macros, "macros");
            Intrinsics.checkNotNullParameter(urls, "urls");
            ArrayList<String> arrayList = new ArrayList(dovishness.gintrap(urls, 10));
            for (String str2 : urls) {
                Intrinsics.checkNotNullParameter(str2, "<this>");
                Intrinsics.checkNotNullParameter(macros, "macros");
                String strPolder = str2;
                for (Map.Entry entry : macros.entrySet()) {
                    strPolder = p002kotlin.text.dovishness.polder(strPolder, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                arrayList.add(strPolder);
            }
            for (String url : arrayList) {
                C3315w3 c3315w3 = C3315w3.a;
                Ag priority = Ag.REGULAR;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(priority, "priority");
                Dg.a(priority, new C3091n3(url, c3097n9, null));
            }
            throw e;
        }
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new Function0() { // from class: adsuki.merc
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this);
            }
        });
    }

    public static final Unit c(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String attributeValue;
        if (Intrinsics.wireman(xmlPullParser.getName(), "Extension")) {
            try {
                attributeValue = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                attributeValue = "";
            }
            if (Intrinsics.wireman(attributeValue, "AdVerifications")) {
                fl.d(xmlPullParser);
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public final C3301ve b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, NotificationCompat.CATEGORY_EVENT);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String strB = AbstractC3134ol.b(v(xmlPullParser));
        if (!AbstractC3134ol.a(strB)) {
            return null;
        }
        if (Intrinsics.wireman(attributeValue, NotificationCompat.CATEGORY_PROGRESS)) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(attributeValue2) && !new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").matches(attributeValue2)) {
                C3097n9 c3097n9 = this.c;
                if (c3097n9 != null) {
                    c3097n9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new O5(strB, attributeValue2);
            }
        } else {
            if (Gl.a.contains(attributeValue)) {
                Intrinsics.beachfront(attributeValue);
                return new C3301ve(strB, attributeValue);
            }
            C3097n9 c3097n10 = this.c;
            if (c3097n10 != null) {
                c3097n10.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    public static final Unit b(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.wireman(xmlPullParser.getName(), "AdVerifications")) {
            fl.c(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) throws C3258tl {
        Cl cl;
        if (continuationImpl instanceof Cl) {
            cl = (Cl) continuationImpl;
            int i = cl.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cl.c = i - Integer.MIN_VALUE;
            } else {
                cl = new Cl(this, continuationImpl);
            }
        } else {
            cl = new Cl(this, continuationImpl);
        }
        Object obj = cl.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = cl.c;
        try {
            if (i2 == 0) {
                dern.saneness(obj);
                if (TextUtils.isEmpty(str)) {
                    C3097n9 c3097n9 = this.c;
                    if (c3097n9 != null) {
                        c3097n9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                    }
                    throw new C3258tl((short) 1100);
                }
                try {
                    XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                    C3342x5.a.getClass();
                    if (!C3342x5.q()) {
                        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                    }
                    XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    Intrinsics.checkNotNullExpressionValue(xmlPullParserNewPullParser, "apply(...)");
                    cl.c = 1;
                    if (a(xmlPullParserNewPullParser, cl) == objBeachfront) {
                        return objBeachfront;
                    }
                } catch (XmlPullParserException unused) {
                    C3097n9 c3097n10 = this.c;
                    if (c3097n10 != null) {
                        c3097n10.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                    }
                    throw new C3258tl((short) 1104);
                } catch (Exception unused2) {
                    C3097n9 c3097n11 = this.c;
                    if (c3097n11 != null) {
                        c3097n11.b("VastParser", "VAST Schema validation error: (Exception)");
                    }
                    throw new C3258tl((short) 1105);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dern.saneness(obj);
            }
            return Unit.f29295attabal;
        } catch (C3258tl e) {
            C3097n9 c3097n12 = this.c;
            if (c3097n12 != null) {
                c3097n12.b("VastParser", "VAST Schema validation error: " + ((int) e.a));
            }
            throw e;
        } catch (Exception e2) {
            C3097n9 c3097n13 = this.c;
            if (c3097n13 != null) {
                String string = Arrays.toString(e2.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c3097n13.b("VastParser", "VAST Schema validation error: (Exception) " + string);
            }
            throw new C3258tl((short) 1106);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws C3258tl {
        C3383yl c3383yl;
        Ref$BooleanRef ref$BooleanRef;
        if (continuationImpl instanceof C3383yl) {
            c3383yl = (C3383yl) continuationImpl;
            int i = c3383yl.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3383yl.d = i - Integer.MIN_VALUE;
            } else {
                c3383yl = new C3383yl(this, continuationImpl);
            }
        } else {
            c3383yl = new C3383yl(this, continuationImpl);
        }
        Object obj = c3383yl.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3383yl.d;
        if (i2 == 0) {
            dern.saneness(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            Function1 c3408zl = new C3408zl(this, null, ref$BooleanRef2, xmlPullParser);
            c3383yl.a = ref$BooleanRef2;
            c3383yl.d = 1;
            if (a(xmlPullParser, "VAST", c3408zl, c3383yl) == objBeachfront) {
                return objBeachfront;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = c3383yl.a;
            dern.saneness(obj);
        }
        if (ref$BooleanRef.element) {
            return Unit.f29295attabal;
        }
        throw new C3258tl((short) 1103);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef) throws XmlPullParserException, C3258tl, IOException {
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name) {
                case "AdVerifications":
                    fl.c(xmlPullParser);
                    break;
                case "Creatives":
                    ref$BooleanRef.element = true;
                    fl.k(xmlPullParser);
                    break;
                case "AdServingId":
                    String strV = fl.v(xmlPullParser);
                    if (strV == null) {
                        strV = "";
                    }
                    fl.g = strV;
                    break;
                case "Error":
                    C3301ve c3301veA = fl.a("error", xmlPullParser);
                    if (c3301veA != null) {
                        fl.i.add(c3301veA);
                    }
                    break;
                case "Extensions":
                    fl.e(xmlPullParser);
                    break;
                case "Impression":
                    fl.f(xmlPullParser);
                    break;
                default:
                    fl.getClass();
                    w(xmlPullParser);
                    break;
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, Fl fl, Ref$BooleanRef ref$BooleanRef2) throws XmlPullParserException, IOException {
        if (Intrinsics.wireman(xmlPullParser.getName(), "Creative")) {
            ref$BooleanRef.element = true;
            if (fl.j(xmlPullParser)) {
                ref$BooleanRef2.element = true;
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -2049897434) {
                if (iHashCode != -1927368268) {
                    if (iHashCode != -385055469) {
                        if (iHashCode == 611554000 && name.equals("TrackingEvents")) {
                            fl.i.addAll(fl.o(xmlPullParser));
                        } else {
                            fl.getClass();
                            w(xmlPullParser);
                        }
                    } else if (name.equals("MediaFiles")) {
                        ref$BooleanRef2.element = true;
                        fl.l.addAll(fl.m(xmlPullParser));
                    } else {
                        fl.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("Duration")) {
                    fl.k = fl.a(xmlPullParser);
                    ref$BooleanRef.element = true;
                } else {
                    fl.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("VideoClicks")) {
                fl.a(xmlPullParser, true);
            } else {
                fl.getClass();
                w(xmlPullParser);
            }
        }
        return Unit.f29295attabal;
    }

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, C3258tl {
        String strV = v(xmlPullParser);
        if (strV != null) {
            if (TextUtils.isEmpty(strV) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(strV)) {
                return strV;
            }
        }
        C3097n9 c3097n9 = this.c;
        if (c3097n9 != null) {
            c3097n9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new C3258tl((short) 1115);
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, Ref$IntRef ref$IntRef) throws XmlPullParserException, IOException {
        int i;
        if (!Intrinsics.wireman(xmlPullParser.getName(), "Companion")) {
            fl.getClass();
            w(xmlPullParser);
            return Unit.f29295attabal;
        }
        ref$IntRef.element++;
        int i2 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue, "getAttributeValue(...)");
            i = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C3097n9 c3097n9 = fl.c;
            if (c3097n9 != null) {
                c3097n9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue2, "getAttributeValue(...)");
            i2 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C3097n9 c3097n10 = fl.c;
            if (c3097n10 != null) {
                c3097n10.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i > 0 && i2 > 0) {
            fl.h(xmlPullParser);
            return Unit.f29295attabal;
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, List list, Ref$ObjectRef ref$ObjectRef, List list2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -348198615) {
                if (iHashCode != 611554000) {
                    if (iHashCode != 676623548) {
                        if (iHashCode == 1877773523 && name.equals("CompanionClickTracking")) {
                            String strB = AbstractC3134ol.b(fl.v(xmlPullParser));
                            if (!AbstractC3134ol.a(strB)) {
                                strB = null;
                            }
                            C3301ve c3301ve = strB != null ? new C3301ve(strB, "click") : null;
                            if (c3301ve != null) {
                                list2.add(c3301ve);
                            }
                        } else {
                            fl.getClass();
                            w(xmlPullParser);
                        }
                    } else if (name.equals("StaticResource")) {
                        fl.a(xmlPullParser, list);
                    } else {
                        fl.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("TrackingEvents")) {
                    list2.addAll(fl.o(xmlPullParser));
                } else {
                    fl.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("CompanionClickThrough")) {
                ?? B = AbstractC3134ol.b(fl.v(xmlPullParser));
                if (AbstractC3134ol.a(B)) {
                    ref$ObjectRef.element = B;
                } else {
                    C3097n9 c3097n9 = fl.c;
                    if (c3097n9 != null) {
                        c3097n9.b("VastParser", "Invalid ClickThrough URL: " + xmlPullParser.getText());
                    }
                }
            } else {
                fl.getClass();
                w(xmlPullParser);
            }
        }
        return Unit.f29295attabal;
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String strB = AbstractC3134ol.b(v(xmlPullParser));
        if (!AbstractC3134ol.a(strB)) {
            C3097n9 c3097n9 = this.c;
            if (c3097n9 != null) {
                c3097n9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || StringsKt.empress(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (p002kotlin.text.dovishness.stratoscope((String) it.next(), attributeValue, true)) {
                    list.add(new C3305vi(strB));
                    return;
                }
            }
        }
        C3097n9 c3097n10 = this.c;
        if (c3097n10 != null) {
            c3097n10.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.e = true;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, List list) throws XmlPullParserException, IOException {
        if (Intrinsics.wireman(xmlPullParser.getName(), "Tracking")) {
            C3301ve c3301veB = fl.b(xmlPullParser);
            if (c3301veB != null) {
                list.add(c3301veB);
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z) {
        a(xmlPullParser, "VideoClicks", new Function0() { // from class: adsuki.supplicat
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, z, this);
            }
        });
    }

    public static final Unit a(XmlPullParser xmlPullParser, boolean z, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.wireman(name, "ClickThrough")) {
            if (z) {
                String strB = AbstractC3134ol.b(fl.v(xmlPullParser));
                if (AbstractC3134ol.a(strB)) {
                    fl.j = strB;
                }
            }
        } else if (Intrinsics.wireman(name, "ClickTracking")) {
            C3301ve c3301veA = fl.a("click", xmlPullParser);
            if (c3301veA != null) {
                fl.i.add(c3301veA);
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    public final boolean a(int i, int i2, String str, String str2, int i3) {
        if (AbstractC3134ol.a(str) && i > 0 && i2 > 0) {
            if (this.a.getBitRate().getBitrate_mandatory() && i3 <= 0) {
                C3097n9 c3097n9 = this.c;
                if (c3097n9 != null) {
                    c3097n9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i3);
                }
                return false;
            }
            if (p002kotlin.text.dovishness.stratoscope(str2, "Progressive", true)) {
                return true;
            }
            C3097n9 c3097n10 = this.c;
            if (c3097n10 != null) {
                c3097n10.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        C3097n9 c3097n11 = this.c;
        if (c3097n11 != null) {
            c3097n11.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + " " + i + ", " + i2);
        }
        return false;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, List list) throws XmlPullParserException, IOException {
        int i;
        int i2;
        if (!Intrinsics.wireman(xmlPullParser.getName(), "MediaFile")) {
            fl.getClass();
            w(xmlPullParser);
            return Unit.f29295attabal;
        }
        ref$BooleanRef.element = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, C3764u.g);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        int i3 = 0;
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "bitrate");
            Intrinsics.checkNotNullExpressionValue(attributeValue3, "getAttributeValue(...)");
            i = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C3097n9 c3097n9 = fl.c;
            if (c3097n9 != null) {
                c3097n9.b("VastParser", "Invalid Value for BitRate.");
            }
            i = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue4, "getAttributeValue(...)");
            i2 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C3097n9 c3097n10 = fl.c;
            if (c3097n10 != null) {
                c3097n10.b("VastParser", "Invalid Value for Media Width.");
            }
            i2 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue5, "getAttributeValue(...)");
            i3 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C3097n9 c3097n11 = fl.c;
            if (c3097n11 != null) {
                c3097n11.b("VastParser", "Invalid Value for Media Height.");
            }
        }
        int i4 = i3;
        String strB = AbstractC3134ol.b(fl.v(xmlPullParser));
        if (!fl.a(i2, i4, strB, attributeValue, i)) {
            return Unit.f29295attabal;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = fl.a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (p002kotlin.text.dovishness.stratoscope((String) it.next(), attributeValue2, true)) {
                        Intrinsics.beachfront(attributeValue);
                        Intrinsics.beachfront(attributeValue2);
                        list.add(new C3159pl(i2, i4, strB, attributeValue, attributeValue2, i));
                        return Unit.f29295attabal;
                    }
                }
            }
        }
        C3097n9 c3097n12 = fl.c;
        if (c3097n12 != null) {
            c3097n12.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (F3.a(attributeValue2)) {
            ref$BooleanRef2.element = true;
        }
        return Unit.f29295attabal;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.wireman(xmlPullParser.getName(), "Verification")) {
            fl.p(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final Unit a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, Fl fl, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, List list) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != 611554000) {
                if (iHashCode != 1561251035) {
                    if (iHashCode == 1749252741 && name.equals("VerificationParameters")) {
                        ref$ObjectRef2.element = AbstractC3134ol.b(fl.v(xmlPullParser));
                    } else {
                        fl.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("JavaScriptResource")) {
                    if (ref$BooleanRef.element) {
                        fl.getClass();
                        w(xmlPullParser);
                        return Unit.f29295attabal;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
                    if (attributeValue != null && p002kotlin.text.dovishness.starveling(attributeValue, CampaignEx.KEY_OMID, false, 2, null)) {
                        ref$BooleanRef.element = true;
                        ref$ObjectRef.element = AbstractC3134ol.b(fl.v(xmlPullParser));
                    }
                } else {
                    fl.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("TrackingEvents")) {
                list.addAll(fl.o(xmlPullParser));
            } else {
                fl.getClass();
                w(xmlPullParser);
            }
        }
        return Unit.f29295attabal;
    }

    public final C3301ve a(String str, XmlPullParser xmlPullParser) {
        String strB = AbstractC3134ol.b(v(xmlPullParser));
        if (!AbstractC3134ol.a(strB)) {
            C3097n9 c3097n9 = this.c;
            if (c3097n9 == null) {
                return null;
            }
            c3097n9.b("VastParser", "Vast Tracker Error: " + str + " " + strB);
            return null;
        }
        return new C3301ve(strB, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, Function0 function0) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && Intrinsics.wireman(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                function0.invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0066 -> B:31:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0074 -> B:31:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r6, java.lang.String r7, p002kotlin.jvm.functions.Function1 r8, p002kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3283ul
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ul r0 = (com.inmobi.media.C3283ul) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.inmobi.media.ul r0 = new com.inmobi.media.ul
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            kotlin.jvm.functions.Function1 r6 = r0.c
            java.lang.String r7 = r0.b
            org.xmlpull.v1.XmlPullParser r8 = r0.a
            p002kotlin.dern.saneness(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L77
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p002kotlin.dern.saneness(r9)
            r5.n(r6)
        L40:
            int r9 = r6.getEventType()
            if (r9 != r3) goto L47
            goto L5e
        L47:
            java.lang.String r9 = r6.getName()
            if (r9 == 0) goto L61
            java.lang.String r9 = r6.getName()
            boolean r9 = p002kotlin.jvm.internal.Intrinsics.wireman(r9, r7)
            if (r9 == 0) goto L61
            int r9 = r6.getEventType()
            r2 = 3
            if (r9 != r2) goto L61
        L5e:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        L61:
            int r9 = r6.getEventType()
            r2 = 2
            if (r9 != r2) goto L77
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            r5.n(r6)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
