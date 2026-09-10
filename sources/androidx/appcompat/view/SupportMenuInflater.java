package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f3430e;
    public static final Class[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3433c;
    public Object d;

    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        public static final Class[] Z = {MenuItem.class};
        public Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Method f3434Y;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f3434Y;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.X;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class MenuState {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public CharSequence f3435A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f3436B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Menu f3438a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3442h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3443i;
        public int j;
        public CharSequence k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f3444l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f3445n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f3446p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f3447u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f3448w;
        public String x;
        public String y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ActionProvider f3449z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3439b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3440c = 0;
        public int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3441e = 0;
        public boolean f = true;
        public boolean g = true;

        public MenuState(Menu menu) {
            this.f3438a = menu;
        }

        public final Object a(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f3433c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.f3447u).setCheckable(this.r >= 1).setTitleCondensed(this.f3444l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            String str = this.y;
            SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
            if (str != null) {
                if (supportMenuInflater.f3433c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (supportMenuInflater.d == null) {
                    supportMenuInflater.d = SupportMenuInflater.a(supportMenuInflater.f3433c);
                }
                Object obj = supportMenuInflater.d;
                String str2 = this.y;
                InflatedOnMenuItemClickListener inflatedOnMenuItemClickListener = new InflatedOnMenuItemClickListener();
                inflatedOnMenuItemClickListener.X = obj;
                Class<?> cls = obj.getClass();
                try {
                    inflatedOnMenuItemClickListener.f3434Y = cls.getMethod(str2, InflatedOnMenuItemClickListener.Z);
                    menuItem.setOnMenuItemClickListener(inflatedOnMenuItemClickListener);
                } catch (Exception e2) {
                    StringBuilder sbY = a.y("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    sbY.append(cls.getName());
                    InflateException inflateException = new InflateException(sbY.toString());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).f(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    try {
                        Method method = menuItemWrapperICS.f3505e;
                        SupportMenuItem supportMenuItem = menuItemWrapperICS.d;
                        if (method == null) {
                            menuItemWrapperICS.f3505e = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.f3505e.invoke(supportMenuItem, Boolean.TRUE);
                    } catch (Exception e3) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                    }
                }
            }
            String str3 = this.x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, SupportMenuInflater.f3430e, supportMenuInflater.f3431a));
                z2 = true;
            }
            int i3 = this.f3448w;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            ActionProvider actionProvider = this.f3449z;
            if (actionProvider != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).b(actionProvider);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            MenuItemCompat.b(menuItem, this.f3435A);
            MenuItemCompat.f(menuItem, this.f3436B);
            MenuItemCompat.a(menuItem, this.f3445n, this.o);
            MenuItemCompat.e(menuItem, this.f3446p, this.q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                MenuItemCompat.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                MenuItemCompat.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f3430e = clsArr;
        f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f3433c = context;
        Object[] objArr = {context};
        this.f3431a = objArr;
        this.f3432b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.appcompat.view.SupportMenuInflater] */
    /* JADX WARN: Type inference failed for: r3v67, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i2;
        ?? r6;
        ColorStateList colorStateList;
        boolean z2;
        MenuState menuState = new MenuState(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        ?? r9 = 0;
        boolean z3 = false;
        String str = null;
        while (r9 == 0) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                        r6 = r4;
                        r9 = r9;
                        z3 = z2;
                    } else if (name2.equals("group")) {
                        menuState.f3439b = 0;
                        menuState.f3440c = 0;
                        menuState.d = 0;
                        menuState.f3441e = 0;
                        menuState.f = r4;
                        menuState.g = r4;
                    } else if (name2.equals("item")) {
                        if (!menuState.f3442h) {
                            ActionProvider actionProvider = menuState.f3449z;
                            if (actionProvider == null || !actionProvider.a()) {
                                menuState.f3442h = r4;
                                menuState.b(menuState.f3438a.add(menuState.f3439b, menuState.f3443i, menuState.j, menuState.k));
                            } else {
                                menuState.f3442h = r4;
                                menuState.b(menuState.f3438a.addSubMenu(menuState.f3439b, menuState.f3443i, menuState.j, menuState.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        ?? r10 = r4;
                        i2 = i2;
                        r6 = r10 == true ? 1 : 0;
                        r9 = r10;
                        z3 = z3;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = r6;
                i2 = i2;
                r9 = r9;
                z3 = z3;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = supportMenuInflater.f3433c.obtainStyledAttributes(attributeSet, R.styleable.f3285p);
                        menuState.f3439b = ObtainStyledAttributes.getResourceId(r4, 0);
                        menuState.f3440c = ObtainStyledAttributes.getInt(3, 0);
                        menuState.d = ObtainStyledAttributes.getInt(4, 0);
                        menuState.f3441e = ObtainStyledAttributes.getInt(5, 0);
                        menuState.f = ObtainStyledAttributes.getBoolean(2, r4);
                        menuState.g = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                        r6 = r4;
                    } else if (name3.equals("item")) {
                        Context context = supportMenuInflater.f3433c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.q);
                        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
                        menuState.f3443i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        menuState.j = (typedArrayObtainStyledAttributes.getInt(6, menuState.d) & 65535) | (typedArrayObtainStyledAttributes.getInt(5, menuState.f3440c) & (-65536));
                        menuState.k = typedArrayObtainStyledAttributes.getText(7);
                        menuState.f3444l = typedArrayObtainStyledAttributes.getText(8);
                        menuState.m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        menuState.f3445n = string == null ? (char) 0 : string.charAt(0);
                        menuState.o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        menuState.f3446p = string2 == null ? (char) 0 : string2.charAt(0);
                        menuState.q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            menuState.r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            menuState.r = menuState.f3441e;
                        }
                        menuState.s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        menuState.t = typedArrayObtainStyledAttributes.getBoolean(4, menuState.f);
                        menuState.f3447u = typedArrayObtainStyledAttributes.getBoolean(1, menuState.g);
                        menuState.v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        menuState.y = typedArrayObtainStyledAttributes.getString(12);
                        menuState.f3448w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        menuState.x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z4 = string3 != null;
                        if (z4 && menuState.f3448w == 0 && menuState.x == null) {
                            menuState.f3449z = (ActionProvider) menuState.a(string3, f, supportMenuInflater.f3432b);
                        } else {
                            if (z4) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            menuState.f3449z = null;
                        }
                        menuState.f3435A = typedArrayObtainStyledAttributes.getText(17);
                        menuState.f3436B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            menuState.D = DrawableUtils.c(typedArrayObtainStyledAttributes.getInt(19, -1), menuState.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            menuState.D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            menuState.C = tintTypedArray.a(18);
                        } else {
                            menuState.C = colorStateList;
                        }
                        tintTypedArray.f();
                        menuState.f3442h = false;
                        r6 = 1;
                    } else {
                        i2 = 2;
                        if (name3.equals("menu")) {
                            r6 = 1;
                            menuState.f3442h = true;
                            SubMenu subMenuAddSubMenu = menuState.f3438a.addSubMenu(menuState.f3439b, menuState.f3443i, menuState.j, menuState.k);
                            menuState.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            r6 = 1;
                            str = name3;
                            z3 = true;
                        }
                    }
                    i2 = 2;
                }
                eventType = xmlResourceParser.next();
                r4 = r6;
                i2 = i2;
                r9 = r9;
                z3 = z3;
            }
            z2 = z3;
            r6 = r4;
            r9 = r9;
            z3 = z2;
            eventType = xmlResourceParser.next();
            r4 = r6;
            i2 = i2;
            r9 = r9;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f3433c.getResources().getLayout(i2);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
