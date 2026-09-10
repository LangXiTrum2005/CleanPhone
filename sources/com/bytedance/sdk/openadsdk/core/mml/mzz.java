package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.oth;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    private final mo.qdl jpc;
    private final mo.ud mo;
    private oth qdl;
    private mo ud;
    private final View.OnAttachStateChangeListener wd;
    private List<qdl> lnr = new ArrayList();
    private final String mml = "BannerSwiperManager";
    private int mzz = -1;

    public mzz(oth othVar, Context context, int i2, int i3) {
        mo.ud udVar = new mo.ud() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.1
            @Override // com.bytedance.sdk.openadsdk.core.mml.mo.ud
            public void qdl(boolean z2) {
                try {
                    if (z2) {
                        mzz.this.mml();
                    } else {
                        mzz.this.lnr();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.mo = udVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                mzz.this.mzz();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (mzz.this.lnr != null && !mzz.this.lnr.isEmpty()) {
                    for (int i4 = 0; i4 < mzz.this.lnr.size(); i4++) {
                        ((qdl) mzz.this.lnr.get(i4)).mo();
                    }
                }
                mzz.this.mzz = -1;
                if (mzz.this.ud != null) {
                    mzz.this.ud.mml();
                }
            }
        };
        this.wd = onAttachStateChangeListener;
        mo.qdl qdlVar = new mo.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.3
            @Override // com.bytedance.sdk.openadsdk.core.mml.mo.qdl
            public void qdl(boolean z2) {
                if (z2) {
                    mzz.this.mml();
                } else {
                    mzz.this.lnr();
                }
            }
        };
        this.jpc = qdlVar;
        this.qdl = othVar;
        mo moVar = new mo(context);
        this.ud = moVar;
        moVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.ud.setSwiperWindowFocusChangedListener(udVar);
        this.ud.setSwiperVisibleChangeListener(qdlVar);
        qdl(context, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        mo moVar;
        oth othVar = this.qdl;
        if (othVar != null && othVar.ud() == 1 && (moVar = this.ud) != null) {
            moVar.mo();
        }
        if (this.mzz >= 0) {
            ud(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        mo moVar;
        oth othVar = this.qdl;
        if (othVar != null && othVar.ud() == 1 && (moVar = this.ud) != null) {
            moVar.mzz();
        }
        int i2 = this.mzz;
        if (i2 >= 0) {
            qdl(i2);
            ud(this.mzz);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void mzz() {
        if (this.qdl == null) {
            this.qdl = new oth();
        }
        this.ud.qdl(TextUtils.equals(this.qdl.qdl(), "vertical") ? 1 : 0).qdl("dot").lnr(false).mml(this.qdl.mml() == 1).qdl(this.qdl.ud() == 1).lnr(this.qdl.tvp()).mzz(this.qdl.to() == 1).mml(this.qdl.jpc()).ud(this.qdl.lnr() == 1).jpc(this.qdl.mzz()).tvp(this.qdl.mo()).wd(this.qdl.wd());
        this.ud.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.mo.lnr() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.4
            @Override // com.bytedance.adsdk.ugeno.mo.lnr
            public void qdl(boolean z2, int i2, float f, int i3) {
            }

            @Override // com.bytedance.adsdk.ugeno.mo.lnr
            public void qdl(boolean z2, int i2, int i3, boolean z3, boolean z4) {
                mzz.this.lnr(i2);
                mzz.this.mzz = i2;
                mzz.this.qdl(i2);
                mzz.this.ud(i2);
            }

            @Override // com.bytedance.adsdk.ugeno.mo.lnr
            public void qdl(boolean z2, int i2) {
                if (i2 == 1 || i2 == 2) {
                    mzz.this.ud(-1);
                } else if (i2 == 0) {
                    mzz mzzVar = mzz.this;
                    mzzVar.qdl(mzzVar.mzz);
                }
            }
        });
        ud(this.lnr);
        this.ud.lnr();
    }

    public void qdl(Context context, float f, float f2) {
        int iUd = ax.ud(context, f);
        int iUd2 = ax.ud(context, f2);
        ViewGroup.LayoutParams layoutParams = this.ud.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iUd, iUd2);
        }
        layoutParams.width = iUd;
        layoutParams.height = iUd2;
        this.ud.setLayoutParams(layoutParams);
    }

    public void ud(int i2) {
        qdl qdlVar;
        for (int i3 = 0; i3 < this.lnr.size(); i3++) {
            try {
                if (i3 != i2 && (qdlVar = this.lnr.get(i3)) != null) {
                    qdlVar.tvp();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(int i2) {
        qdl qdlVar;
        try {
            int i3 = this.mzz;
            if (i3 != -1 && i3 != i2 && (qdlVar = this.lnr.get(i3)) != null) {
                qdlVar.mml();
                qdlVar.jpc();
            }
            qdl qdlVar2 = this.lnr.get(i2);
            if (qdlVar2 != null) {
                qdlVar2.mzz();
            }
        } catch (Throwable unused) {
        }
    }

    private void ud(List<qdl> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.ud.qdl(list.get(i2).qdl());
        }
    }

    public void qdl(List<qdl> list) {
        this.lnr = list;
    }

    public View ud() {
        return this.ud;
    }

    public void qdl(final int i2) {
        qdl qdlVar;
        try {
            final int size = this.lnr.size();
            if (i2 < size && (qdlVar = this.lnr.get(i2)) != null) {
                qdlVar.qdl(new com.bytedance.sdk.openadsdk.qdl.qdl.ud() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.5
                    @Override // com.bytedance.sdk.openadsdk.qdl.qdl.ud
                    public void qdl() {
                        int i3 = i2 + 1;
                        if (i3 >= size) {
                            return;
                        }
                        mzz.this.qdl(i3);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void qdl() {
        if (this.ud != null) {
            try {
                List<qdl> list = this.lnr;
                if (list != null && !list.isEmpty()) {
                    for (int i2 = 0; i2 < this.lnr.size(); i2++) {
                        this.lnr.get(i2).wd();
                    }
                }
                this.mzz = -1;
                this.ud.mml();
                this.ud.setSwiperWindowFocusChangedListener(null);
                this.ud.setSwiperVisibleChangeListener(null);
                this.ud.removeOnAttachStateChangeListener(this.wd);
                this.ud = null;
            } catch (Throwable unused) {
            }
        }
    }
}
