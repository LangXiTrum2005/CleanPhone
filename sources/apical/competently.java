package apical;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.dovishness;
import androidx.appcompat.widget.restrictive;
import androidx.core.view.cord;
import beachfront.cutely;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SupportMenuInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class competently extends MenuInflater {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Class<?>[] f14240beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Class<?>[] f14241marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object[] f14242attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Context f14243dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object[] f14244saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Object f14245wireman;

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public static class attabal implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final Class<?>[] f14246dern = {MenuItem.class};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Object f14247attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Method f14248saneness;

        public attabal(Object obj, String str) {
            this.f14247attabal = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f14248saneness = cls.getMethod(str, f14246dern);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f14248saneness.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f14248saneness.invoke(this.f14247attabal, menuItem)).booleanValue();
                }
                this.f14248saneness.invoke(this.f14247attabal, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public class saneness {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public boolean f14249adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public CharSequence f14250apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public char f14251arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Menu f14252attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f14253beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public boolean f14254competently;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public String f14255cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public androidx.core.view.saneness f14256cuirassed;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f14257cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f14258dern;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public int f14259dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public CharSequence f14260formularize;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public int f14261gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public boolean f14262graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f14263impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f14264impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f14265kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f14266marial;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public boolean f14267molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f14268monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f14270polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public String f14271preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public String f14272rotuma;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f14273saneness;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public CharSequence f14275stratoscope;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f14276taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public char f14277triweekly;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public CharSequence f14278trm;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f14279wireman;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public ColorStateList f14269oilcan = null;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public PorterDuff.Mode f14280yemenite = null;

        public saneness(Menu menu) {
            this.f14252attabal = menu;
            impromptu();
        }

        public void attabal() {
            this.f14264impromptu = true;
            taiyuan(this.f14252attabal.add(this.f14273saneness, this.f14276taiyuan, this.f14257cutely, this.f14250apical));
        }

        public void beachfront(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = competently.this.f14243dern.obtainStyledAttributes(attributeSet, cutely.MenuGroup);
            this.f14273saneness = typedArrayObtainStyledAttributes.getResourceId(cutely.MenuGroup_android_id, 0);
            this.f14258dern = typedArrayObtainStyledAttributes.getInt(cutely.MenuGroup_android_menuCategory, 0);
            this.f14279wireman = typedArrayObtainStyledAttributes.getInt(cutely.MenuGroup_android_orderInCategory, 0);
            this.f14266marial = typedArrayObtainStyledAttributes.getInt(cutely.MenuGroup_android_checkableBehavior, 0);
            this.f14253beachfront = typedArrayObtainStyledAttributes.getBoolean(cutely.MenuGroup_android_visible, true);
            this.f14254competently = typedArrayObtainStyledAttributes.getBoolean(cutely.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void competently(AttributeSet attributeSet) {
            restrictive restrictiveVarAdultoid = restrictive.adultoid(competently.this.f14243dern, attributeSet, cutely.MenuItem);
            this.f14276taiyuan = restrictiveVarAdultoid.triweekly(cutely.MenuItem_android_id, 0);
            this.f14257cutely = (restrictiveVarAdultoid.apical(cutely.MenuItem_android_menuCategory, this.f14258dern) & Opcodes.V_PREVIEW) | (restrictiveVarAdultoid.apical(cutely.MenuItem_android_orderInCategory, this.f14279wireman) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f14250apical = restrictiveVarAdultoid.arytenoidectomy(cutely.MenuItem_android_title);
            this.f14260formularize = restrictiveVarAdultoid.arytenoidectomy(cutely.MenuItem_android_titleCondensed);
            this.f14263impassible = restrictiveVarAdultoid.triweekly(cutely.MenuItem_android_icon, 0);
            this.f14277triweekly = dern(restrictiveVarAdultoid.kowloon(cutely.MenuItem_android_alphabeticShortcut));
            this.f14265kowloon = restrictiveVarAdultoid.apical(cutely.MenuItem_alphabeticModifiers, 4096);
            this.f14251arytenoidectomy = dern(restrictiveVarAdultoid.kowloon(cutely.MenuItem_android_numericShortcut));
            this.f14268monoploid = restrictiveVarAdultoid.apical(cutely.MenuItem_numericModifiers, 4096);
            if (restrictiveVarAdultoid.molybdenite(cutely.MenuItem_android_checkable)) {
                this.f14270polloi = restrictiveVarAdultoid.attabal(cutely.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f14270polloi = this.f14266marial;
            }
            this.f14267molybdenite = restrictiveVarAdultoid.attabal(cutely.MenuItem_android_checked, false);
            this.f14262graveside = restrictiveVarAdultoid.attabal(cutely.MenuItem_android_visible, this.f14253beachfront);
            this.f14249adultoid = restrictiveVarAdultoid.attabal(cutely.MenuItem_android_enabled, this.f14254competently);
            this.f14259dovishness = restrictiveVarAdultoid.apical(cutely.MenuItem_showAsAction, -1);
            this.f14255cord = restrictiveVarAdultoid.kowloon(cutely.MenuItem_android_onClick);
            this.f14261gintrap = restrictiveVarAdultoid.triweekly(cutely.MenuItem_actionLayout, 0);
            this.f14272rotuma = restrictiveVarAdultoid.kowloon(cutely.MenuItem_actionViewClass);
            String strKowloon = restrictiveVarAdultoid.kowloon(cutely.MenuItem_actionProviderClass);
            this.f14271preprohormone = strKowloon;
            if (strKowloon != null && this.f14261gintrap == 0 && this.f14272rotuma == null) {
                this.f14256cuirassed = (androidx.core.view.saneness) marial(strKowloon, competently.f14240beachfront, competently.this.f14244saneness);
            } else {
                this.f14256cuirassed = null;
            }
            this.f14275stratoscope = restrictiveVarAdultoid.arytenoidectomy(cutely.MenuItem_contentDescription);
            this.f14278trm = restrictiveVarAdultoid.arytenoidectomy(cutely.MenuItem_tooltipText);
            if (restrictiveVarAdultoid.molybdenite(cutely.MenuItem_iconTintMode)) {
                this.f14280yemenite = dovishness.marial(restrictiveVarAdultoid.apical(cutely.MenuItem_iconTintMode, -1), this.f14280yemenite);
            } else {
                this.f14280yemenite = null;
            }
            if (restrictiveVarAdultoid.molybdenite(cutely.MenuItem_iconTint)) {
                this.f14269oilcan = restrictiveVarAdultoid.dern(cutely.MenuItem_iconTint);
            } else {
                this.f14269oilcan = null;
            }
            restrictiveVarAdultoid.rotuma();
            this.f14264impromptu = false;
        }

        public final char dern(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public void impromptu() {
            this.f14273saneness = 0;
            this.f14258dern = 0;
            this.f14279wireman = 0;
            this.f14266marial = 0;
            this.f14253beachfront = true;
            this.f14254competently = true;
        }

        public final <T> T marial(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, competently.this.f14243dern.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public SubMenu saneness() {
            this.f14264impromptu = true;
            SubMenu subMenuAddSubMenu = this.f14252attabal.addSubMenu(this.f14273saneness, this.f14276taiyuan, this.f14257cutely, this.f14250apical);
            taiyuan(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final void taiyuan(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f14267molybdenite).setVisible(this.f14262graveside).setEnabled(this.f14249adultoid).setCheckable(this.f14270polloi >= 1).setTitleCondensed(this.f14260formularize).setIcon(this.f14263impassible);
            int i = this.f14259dovishness;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f14255cord != null) {
                if (competently.this.f14243dern.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new attabal(competently.this.saneness(), this.f14255cord));
            }
            if (this.f14270polloi >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.competently) {
                    ((androidx.appcompat.view.menu.competently) menuItem).graveside(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.impromptu) {
                    ((androidx.appcompat.view.menu.impromptu) menuItem).impromptu(true);
                }
            }
            String str = this.f14272rotuma;
            if (str != null) {
                menuItem.setActionView((View) marial(str, competently.f14241marial, competently.this.f14242attabal));
                z = true;
            }
            int i2 = this.f14261gintrap;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            androidx.core.view.saneness sanenessVar = this.f14256cuirassed;
            if (sanenessVar != null) {
                cord.attabal(menuItem, sanenessVar);
            }
            cord.dern(menuItem, this.f14275stratoscope);
            cord.competently(menuItem, this.f14278trm);
            cord.saneness(menuItem, this.f14277triweekly, this.f14265kowloon);
            cord.beachfront(menuItem, this.f14251arytenoidectomy, this.f14268monoploid);
            PorterDuff.Mode mode = this.f14280yemenite;
            if (mode != null) {
                cord.marial(menuItem, mode);
            }
            ColorStateList colorStateList = this.f14269oilcan;
            if (colorStateList != null) {
                cord.wireman(menuItem, colorStateList);
            }
        }

        public boolean wireman() {
            return this.f14264impromptu;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f14241marial = clsArr;
        f14240beachfront = clsArr;
    }

    public competently(Context context) {
        super(context);
        this.f14243dern = context;
        Object[] objArr = {context};
        this.f14242attabal = objArr;
        this.f14244saneness = objArr;
    }

    public final Object attabal(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? attabal(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void dern(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        saneness sanenessVar = new saneness(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        sanenessVar.impromptu();
                    } else if (name2.equals("item")) {
                        if (!sanenessVar.wireman()) {
                            androidx.core.view.saneness sanenessVar2 = sanenessVar.f14256cuirassed;
                            if (sanenessVar2 == null || !sanenessVar2.attabal()) {
                                sanenessVar.attabal();
                            } else {
                                sanenessVar.saneness();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    sanenessVar.beachfront(attributeSet);
                } else if (name3.equals("item")) {
                    sanenessVar.competently(attributeSet);
                } else if (name3.equals("menu")) {
                    dern(xmlPullParser, attributeSet, sanenessVar.saneness());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof julian.attabal)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f14243dern.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.marial) {
                    androidx.appcompat.view.menu.marial marialVar = (androidx.appcompat.view.menu.marial) menu;
                    if (marialVar.supplicat()) {
                        marialVar.nosophobia();
                        z = true;
                    }
                }
                dern(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((androidx.appcompat.view.menu.marial) menu).lerp();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((androidx.appcompat.view.menu.marial) menu).lerp();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public Object saneness() {
        if (this.f14245wireman == null) {
            this.f14245wireman = attabal(this.f14243dern);
        }
        return this.f14245wireman;
    }
}
