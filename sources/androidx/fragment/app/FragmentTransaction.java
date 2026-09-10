package androidx.fragment.app;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentTransaction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5159c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5160e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5162i;
    public CharSequence j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f5163l;
    public ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f5164n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5157a = new ArrayList();
    public boolean o = false;

    public final void b(Op op) {
        this.f5157a.add(op);
        op.d = this.f5158b;
        op.f5168e = this.f5159c;
        op.f = this.d;
        op.g = this.f5160e;
    }

    public abstract int c();

    public abstract int d();

    public abstract void e();

    public abstract void f();

    public void g(Fragment fragment) {
        b(new Op(fragment, 6));
    }

    public void h(int i2, Fragment fragment, String str, int i3) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(android.support.v4.media.a.s(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        b(new Op(fragment, i3));
    }

    public void i(Fragment fragment) {
        b(new Op(fragment, 4));
    }

    public void j(Fragment fragment) {
        b(new Op(fragment, 3));
    }

    public void k(Fragment fragment) {
        b(new Op(fragment, 5));
    }

    public static final class Op {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f5166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5167c = false;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5168e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Lifecycle.State f5169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Lifecycle.State f5170i;

        public Op(Fragment fragment, int i2) {
            this.f5165a = i2;
            this.f5166b = fragment;
            Lifecycle.State state = Lifecycle.State.f0;
            this.f5169h = state;
            this.f5170i = state;
        }

        public Op(Fragment fragment, int i2, int i3) {
            this.f5165a = i2;
            this.f5166b = fragment;
            Lifecycle.State state = Lifecycle.State.f0;
            this.f5169h = state;
            this.f5170i = state;
        }
    }
}
