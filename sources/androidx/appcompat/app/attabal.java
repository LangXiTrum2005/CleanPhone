package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends kowloon implements DialogInterface {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final AlertController f4762graveside;

    /* JADX INFO: renamed from: androidx.appcompat.app.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AlertDialog.java */
    public static class C0029attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AlertController.saneness f4763attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f4764saneness;

        public C0029attabal(Context context) {
            this(context, attabal.impassible(context, 0));
        }

        public attabal attabal() {
            attabal attabalVar = new attabal(this.f4763attabal.f4589attabal, this.f4764saneness);
            this.f4763attabal.attabal(attabalVar.f4762graveside);
            attabalVar.setCancelable(this.f4763attabal.f4611polloi);
            if (this.f4763attabal.f4611polloi) {
                attabalVar.setCanceledOnTouchOutside(true);
            }
            attabalVar.setOnCancelListener(this.f4763attabal.f4607molybdenite);
            attabalVar.setOnDismissListener(this.f4763attabal.f4599graveside);
            DialogInterface.OnKeyListener onKeyListener = this.f4763attabal.f4586adultoid;
            if (onKeyListener != null) {
                attabalVar.setOnKeyListener(onKeyListener);
            }
            return attabalVar;
        }

        public C0029attabal beachfront(DialogInterface.OnKeyListener onKeyListener) {
            this.f4763attabal.f4586adultoid = onKeyListener;
            return this;
        }

        public C0029attabal competently(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.saneness sanenessVar = this.f4763attabal;
            sanenessVar.f4598gintrap = listAdapter;
            sanenessVar.f4615rotuma = onClickListener;
            sanenessVar.f4614restrictive = i;
            sanenessVar.f4621supplicat = true;
            return this;
        }

        public C0029attabal dern(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.saneness sanenessVar = this.f4763attabal;
            sanenessVar.f4598gintrap = listAdapter;
            sanenessVar.f4615rotuma = onClickListener;
            return this;
        }

        public C0029attabal impromptu(CharSequence charSequence) {
            this.f4763attabal.f4590beachfront = charSequence;
            return this;
        }

        public C0029attabal marial(Drawable drawable) {
            this.f4763attabal.f4625wireman = drawable;
            return this;
        }

        public Context saneness() {
            return this.f4763attabal.f4589attabal;
        }

        public C0029attabal wireman(View view) {
            this.f4763attabal.f4591competently = view;
            return this;
        }

        public C0029attabal(Context context, int i) {
            this.f4763attabal = new AlertController.saneness(new ContextThemeWrapper(context, attabal.impassible(context, i)));
            this.f4764saneness = i;
        }
    }

    public attabal(Context context, int i) {
        super(context, impassible(context, i));
        this.f4762graveside = new AlertController(getContext(), this, getWindow());
    }

    public static int impassible(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(beachfront.attabal.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView formularize() {
        return this.f4762graveside.wireman();
    }

    @Override // androidx.appcompat.app.kowloon, androidx.p000activity.monoploid, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4762graveside.marial();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f4762graveside.beachfront(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f4762graveside.competently(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.kowloon, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f4762graveside.arytenoidectomy(charSequence);
    }
}
