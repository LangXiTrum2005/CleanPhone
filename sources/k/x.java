package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f44190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f44191d;

    public x(View view, String str) {
        this.f44188a = view;
        this.f44189b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f44190c != null) {
            break;
        }
        View view2 = this.f44188a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f44189b;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                }
                StringBuilder sbK = d5.u.k("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbK.append(view2.getClass());
                sbK.append(str);
                throw new IllegalStateException(sbK.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f44190c = method;
                    this.f44191d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f44190c.invoke(this.f44191d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
