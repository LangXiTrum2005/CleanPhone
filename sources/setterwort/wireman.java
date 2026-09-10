package setterwort;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.hardpan;
import androidx.core.view.premeiotic;
import androidx.core.view.sensatory;
import androidx.core.view.supplicat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: SystemBarStateMonitor.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View f37528attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public monroe.wireman f37529dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f37530marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<dern> f37531saneness = new ArrayList<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public monroe.wireman f37532wireman;

    /* JADX INFO: compiled from: SystemBarStateMonitor.java */
    public class attabal extends View {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f37534kowloon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(Context context, ViewGroup viewGroup) {
            super(context);
            this.f37534kowloon = viewGroup;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f37534kowloon.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (wireman.this.f37530marial != color) {
                wireman.this.f37530marial = color;
                for (int size = wireman.this.f37531saneness.size() - 1; size >= 0; size--) {
                    ((dern) wireman.this.f37531saneness.get(size)).marial(color);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SystemBarStateMonitor.java */
    public interface dern {
        void attabal();

        void dern(monroe.wireman wiremanVar, monroe.wireman wiremanVar2);

        void marial(int i);

        void saneness();

        void wireman(int i, monroe.wireman wiremanVar, RectF rectF);
    }

    /* JADX INFO: compiled from: SystemBarStateMonitor.java */
    public class saneness extends sensatory.saneness {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final HashMap<sensatory, Integer> f37535dern;

        public saneness(int i) {
            super(i);
            this.f37535dern = new HashMap<>();
        }

        public final boolean beachfront(sensatory sensatoryVar) {
            return (sensatoryVar.wireman() & hardpan.triweekly.competently()) != 0;
        }

        @Override // androidx.core.view.sensatory.saneness
        public void dern(sensatory sensatoryVar) {
            if (beachfront(sensatoryVar)) {
                for (int size = wireman.this.f37531saneness.size() - 1; size >= 0; size--) {
                    ((dern) wireman.this.f37531saneness.get(size)).saneness();
                }
            }
        }

        @Override // androidx.core.view.sensatory.saneness
        public sensatory.attabal marial(sensatory sensatoryVar, sensatory.attabal attabalVar) {
            if (!beachfront(sensatoryVar)) {
                return attabalVar;
            }
            monroe.wireman wiremanVarSaneness = attabalVar.saneness();
            monroe.wireman wiremanVarAttabal = attabalVar.attabal();
            int i = wiremanVarSaneness.f33604attabal != wiremanVarAttabal.f33604attabal ? 1 : 0;
            if (wiremanVarSaneness.f33606saneness != wiremanVarAttabal.f33606saneness) {
                i |= 2;
            }
            if (wiremanVarSaneness.f33605dern != wiremanVarAttabal.f33605dern) {
                i |= 4;
            }
            if (wiremanVarSaneness.f33607wireman != wiremanVarAttabal.f33607wireman) {
                i |= 8;
            }
            this.f37535dern.put(sensatoryVar, Integer.valueOf(i));
            return attabalVar;
        }

        @Override // androidx.core.view.sensatory.saneness
        public void saneness(sensatory sensatoryVar) {
            if (beachfront(sensatoryVar)) {
                this.f37535dern.remove(sensatoryVar);
                for (int size = wireman.this.f37531saneness.size() - 1; size >= 0; size--) {
                    ((dern) wireman.this.f37531saneness.get(size)).attabal();
                }
            }
        }

        @Override // androidx.core.view.sensatory.saneness
        public hardpan wireman(hardpan hardpanVar, List<sensatory> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                sensatory sensatoryVar = list.get(size);
                Integer num = this.f37535dern.get(sensatoryVar);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fAttabal = sensatoryVar.attabal();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fAttabal;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fAttabal;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fAttabal;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fAttabal;
                    }
                    i |= iIntValue;
                }
            }
            monroe.wireman wiremanVarTaiyuan = wireman.this.taiyuan(hardpanVar);
            for (int size2 = wireman.this.f37531saneness.size() - 1; size2 >= 0; size2--) {
                ((dern) wireman.this.f37531saneness.get(size2)).wireman(i, wiremanVarTaiyuan, rectF);
            }
            return hardpanVar;
        }
    }

    public wireman(ViewGroup viewGroup) {
        monroe.wireman wiremanVar = monroe.wireman.f33603marial;
        this.f37529dern = wiremanVar;
        this.f37532wireman = wiremanVar;
        Drawable background = viewGroup.getBackground();
        this.f37530marial = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        attabal attabalVar = new attabal(viewGroup.getContext(), viewGroup);
        this.f37528attabal = attabalVar;
        attabalVar.setWillNotDraw(true);
        premeiotic.picketboat(attabalVar, new supplicat() { // from class: setterwort.saneness
            @Override // androidx.core.view.supplicat
            public final hardpan attabal(View view, hardpan hardpanVar) {
                return wireman.saneness(this.f37527attabal, view, hardpanVar);
            }
        });
        premeiotic.claque(attabalVar, new saneness(0));
        viewGroup.addView(attabalVar, 0);
    }

    public static /* synthetic */ void attabal(wireman wiremanVar) {
        ViewParent parent = wiremanVar.f37528attabal.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(wiremanVar.f37528attabal);
        }
    }

    public static /* synthetic */ hardpan saneness(wireman wiremanVar, View view, hardpan hardpanVar) {
        monroe.wireman wiremanVarTaiyuan = wiremanVar.taiyuan(hardpanVar);
        monroe.wireman wiremanVarCutely = wiremanVar.cutely(hardpanVar);
        if (!wiremanVarTaiyuan.equals(wiremanVar.f37529dern) || !wiremanVarCutely.equals(wiremanVar.f37532wireman)) {
            wiremanVar.f37529dern = wiremanVarTaiyuan;
            wiremanVar.f37532wireman = wiremanVarCutely;
            for (int size = wiremanVar.f37531saneness.size() - 1; size >= 0; size--) {
                wiremanVar.f37531saneness.get(size).dern(wiremanVarTaiyuan, wiremanVarCutely);
            }
        }
        return hardpanVar;
    }

    public boolean apical() {
        return !this.f37531saneness.isEmpty();
    }

    public void competently(dern dernVar) {
        if (this.f37531saneness.contains(dernVar)) {
            return;
        }
        this.f37531saneness.add(dernVar);
        dernVar.dern(this.f37529dern, this.f37532wireman);
        dernVar.marial(this.f37530marial);
    }

    public final monroe.wireman cutely(hardpan hardpanVar) {
        return monroe.wireman.saneness(hardpanVar.competently(hardpan.triweekly.competently()), hardpanVar.competently(hardpan.triweekly.taiyuan()));
    }

    public void formularize(dern dernVar) {
        this.f37531saneness.remove(dernVar);
    }

    public void impromptu() {
        this.f37528attabal.post(new Runnable() { // from class: setterwort.dern
            @Override // java.lang.Runnable
            public final void run() {
                wireman.attabal(this.f37526kowloon);
            }
        });
    }

    public final monroe.wireman taiyuan(hardpan hardpanVar) {
        return monroe.wireman.saneness(hardpanVar.beachfront(hardpan.triweekly.competently()), hardpanVar.beachfront(hardpan.triweekly.taiyuan()));
    }
}
