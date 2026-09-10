package empress;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: RunGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static int f25695impromptu;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f25697beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f25698competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public WidgetRun f25699dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public WidgetRun f25702wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f25696attabal = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f25701saneness = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ArrayList<WidgetRun> f25700marial = new ArrayList<>();

    public taiyuan(WidgetRun widgetRun, int i) {
        this.f25699dern = null;
        this.f25702wireman = null;
        int i2 = f25695impromptu;
        this.f25697beachfront = i2;
        f25695impromptu = i2 + 1;
        this.f25699dern = widgetRun;
        this.f25702wireman = widgetRun;
        this.f25698competently = i;
    }

    public void attabal(WidgetRun widgetRun) {
        this.f25700marial.add(widgetRun);
        this.f25702wireman = widgetRun;
    }

    public final long dern(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f8193wireman;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.saneness) {
            return j;
        }
        int size = dependencyNode.f8187cutely.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            wireman wiremanVar = dependencyNode.f8187cutely.get(i);
            if (wiremanVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) wiremanVar;
                if (dependencyNode2.f8193wireman != widgetRun) {
                    jMin = Math.min(jMin, dern(dependencyNode2, ((long) dependencyNode2.f8185beachfront) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f8203taiyuan) {
            return jMin;
        }
        long jCutely = j - widgetRun.cutely();
        return Math.min(Math.min(jMin, dern(widgetRun.f8200impromptu, jCutely)), jCutely - ((long) widgetRun.f8200impromptu.f8185beachfront));
    }

    public long saneness(androidx.constraintlayout.core.widgets.wireman wiremanVar, int i) {
        long jCutely;
        int i2;
        WidgetRun widgetRun = this.f25699dern;
        if (widgetRun instanceof dern) {
            if (((dern) widgetRun).f8196beachfront != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.dern)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.wireman)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i == 0 ? wiremanVar.f8130marial : wiremanVar.f8090beachfront).f8200impromptu;
        DependencyNode dependencyNode2 = (i == 0 ? wiremanVar.f8130marial : wiremanVar.f8090beachfront).f8203taiyuan;
        boolean zContains = widgetRun.f8200impromptu.f8183apical.contains(dependencyNode);
        boolean zContains2 = this.f25699dern.f8203taiyuan.f8183apical.contains(dependencyNode2);
        long jCutely2 = this.f25699dern.cutely();
        if (zContains && zContains2) {
            long jWireman = wireman(this.f25699dern.f8200impromptu, 0L);
            long jDern = dern(this.f25699dern.f8203taiyuan, 0L);
            long j = jWireman - jCutely2;
            WidgetRun widgetRun2 = this.f25699dern;
            int i3 = widgetRun2.f8203taiyuan.f8185beachfront;
            if (j >= (-i3)) {
                j += (long) i3;
            }
            int i4 = widgetRun2.f8200impromptu.f8185beachfront;
            long j2 = ((-jDern) - jCutely2) - ((long) i4);
            if (j2 >= i4) {
                j2 -= (long) i4;
            }
            float fMolybdenite = widgetRun2.f8202saneness.molybdenite(i);
            float f = fMolybdenite > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (long) ((j2 / fMolybdenite) + (j / (1.0f - fMolybdenite))) : 0L;
            long j3 = ((long) ((f * fMolybdenite) + 0.5f)) + jCutely2 + ((long) ((f * (1.0f - fMolybdenite)) + 0.5f));
            WidgetRun widgetRun3 = this.f25699dern;
            jCutely = ((long) widgetRun3.f8200impromptu.f8185beachfront) + j3;
            i2 = widgetRun3.f8203taiyuan.f8185beachfront;
        } else {
            if (zContains) {
                DependencyNode dependencyNode3 = this.f25699dern.f8200impromptu;
                return Math.max(wireman(dependencyNode3, dependencyNode3.f8185beachfront), ((long) this.f25699dern.f8200impromptu.f8185beachfront) + jCutely2);
            }
            if (zContains2) {
                DependencyNode dependencyNode4 = this.f25699dern.f8203taiyuan;
                return Math.max(-dern(dependencyNode4, dependencyNode4.f8185beachfront), ((long) (-this.f25699dern.f8203taiyuan.f8185beachfront)) + jCutely2);
            }
            WidgetRun widgetRun4 = this.f25699dern;
            jCutely = ((long) widgetRun4.f8200impromptu.f8185beachfront) + widgetRun4.cutely();
            i2 = this.f25699dern.f8203taiyuan.f8185beachfront;
        }
        return jCutely - ((long) i2);
    }

    public final long wireman(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f8193wireman;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.saneness) {
            return j;
        }
        int size = dependencyNode.f8187cutely.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            wireman wiremanVar = dependencyNode.f8187cutely.get(i);
            if (wiremanVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) wiremanVar;
                if (dependencyNode2.f8193wireman != widgetRun) {
                    jMax = Math.max(jMax, wireman(dependencyNode2, ((long) dependencyNode2.f8185beachfront) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f8200impromptu) {
            return jMax;
        }
        long jCutely = j + widgetRun.cutely();
        return Math.max(Math.max(jMax, wireman(widgetRun.f8203taiyuan, jCutely)), jCutely - ((long) widgetRun.f8203taiyuan.f8185beachfront));
    }
}
