package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {
    public final FragmentActivity X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final FragmentActivity f5109Y;
    public final Handler Z;
    public final FragmentManager e0;

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.e0 = new FragmentManagerImpl();
        this.X = fragmentActivity;
        this.f5109Y = fragmentActivity;
        this.Z = handler;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View b(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean c() {
        return true;
    }

    public abstract FragmentActivity e();

    public LayoutInflater f() {
        return LayoutInflater.from(this.f5109Y);
    }

    public boolean g(String str) {
        return false;
    }

    public void h() {
    }

    public void d(PrintWriter printWriter, String[] strArr) {
    }
}
