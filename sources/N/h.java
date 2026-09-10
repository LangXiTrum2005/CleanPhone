package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.auth.o;
import java.io.IOException;
import o.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.h1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f46309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f46310f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f46311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f46312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f46314d;

    static {
        Class[] clsArr = {Context.class};
        f46309e = clsArr;
        f46310f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f46313c = context;
        Object[] objArr = {context};
        this.f46311a = objArr;
        this.f46312b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z11) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f46313c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f43531p);
                        gVar.f46285b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f46286c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f46287d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f46288e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f46289f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        gVar.f46290g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.f43532q);
                        gVar.f46292i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        gVar.f46293j = (typedArrayObtainStyledAttributes2.getInt(5, gVar.f46286c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gVar.f46287d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        gVar.f46294k = typedArrayObtainStyledAttributes2.getText(7);
                        gVar.l = typedArrayObtainStyledAttributes2.getText(8);
                        gVar.f46295m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        gVar.f46296n = string == null ? (char) 0 : string.charAt(0);
                        gVar.f46297o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        gVar.f46298p = string2 == null ? (char) 0 : string2.charAt(0);
                        gVar.f46299q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            gVar.f46300r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            gVar.f46300r = gVar.f46288e;
                        }
                        gVar.f46301s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        gVar.f46302t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f46289f);
                        gVar.f46303u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f46290g);
                        gVar.f46304v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        gVar.f46307y = typedArrayObtainStyledAttributes2.getString(12);
                        gVar.f46305w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        gVar.f46306x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z12 = string3 != null;
                        if (z12 && gVar.f46305w == 0 && gVar.f46306x == null) {
                            gVar.f46308z = (p) gVar.a(string3, f46310f, this.f46312b);
                        } else {
                            if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            gVar.f46308z = null;
                        }
                        gVar.A = typedArrayObtainStyledAttributes2.getText(17);
                        gVar.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            gVar.D = h1.c(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.D);
                        } else {
                            gVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = o.h(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            gVar.C = colorStateList;
                        } else {
                            gVar.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        gVar.f46291h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        gVar.f46291h = true;
                        SubMenu subMenuAddSubMenu = gVar.f46284a.addSubMenu(gVar.f46285b, gVar.f46292i, gVar.f46293j, gVar.f46294k);
                        gVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z11 = true;
                    }
                }
                z10 = z10;
            } else if (eventType != 3) {
                z10 = z10;
            } else {
                String name3 = xmlPullParser.getName();
                if (z11 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z11 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        gVar.f46285b = 0;
                        gVar.f46286c = 0;
                        gVar.f46287d = 0;
                        gVar.f46288e = 0;
                        gVar.f46289f = true;
                        gVar.f46290g = true;
                    } else if (name3.equals("item")) {
                        if (!gVar.f46291h) {
                            p pVar = gVar.f46308z;
                            if (pVar == null || !pVar.f47011b.hasSubMenu()) {
                                gVar.f46291h = true;
                                gVar.b(gVar.f46284a.add(gVar.f46285b, gVar.f46292i, gVar.f46293j, gVar.f46294k));
                            } else {
                                gVar.f46291h = true;
                                gVar.b(gVar.f46284a.addSubMenu(gVar.f46285b, gVar.f46292i, gVar.f46293j, gVar.f46294k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z10 = true;
                    }
                    z10 = z10;
                }
            }
            eventType = xmlPullParser.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof o.m)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f46313c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof o.m) {
                    o.m mVar = (o.m) menu;
                    if (!mVar.f46973p) {
                        mVar.w();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((o.m) menu).v();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((o.m) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
