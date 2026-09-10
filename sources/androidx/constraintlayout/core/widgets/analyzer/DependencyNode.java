package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements empress.wireman {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f8185beachfront;
    public int value;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public WidgetRun f8193wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public empress.wireman f8184attabal = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f8191saneness = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f8188dern = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Type f8190marial = Type.UNKNOWN;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f8186competently = 1;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public attabal f8189impromptu = null;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f8192taiyuan = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public List<empress.wireman> f8187cutely = new ArrayList();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public List<DependencyNode> f8183apical = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f8193wireman = widgetRun;
    }

    @Override // empress.wireman
    public void attabal(empress.wireman wiremanVar) {
        Iterator<DependencyNode> it = this.f8183apical.iterator();
        while (it.hasNext()) {
            if (!it.next().f8192taiyuan) {
                return;
            }
        }
        this.f8188dern = true;
        empress.wireman wiremanVar2 = this.f8184attabal;
        if (wiremanVar2 != null) {
            wiremanVar2.attabal(this);
        }
        if (this.f8191saneness) {
            this.f8193wireman.attabal(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        for (DependencyNode dependencyNode2 : this.f8183apical) {
            if (!(dependencyNode2 instanceof attabal)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.f8192taiyuan) {
            attabal attabalVar = this.f8189impromptu;
            if (attabalVar != null) {
                if (!attabalVar.f8192taiyuan) {
                    return;
                } else {
                    this.f8185beachfront = this.f8186competently * attabalVar.value;
                }
            }
            wireman(dependencyNode.value + this.f8185beachfront);
        }
        empress.wireman wiremanVar3 = this.f8184attabal;
        if (wiremanVar3 != null) {
            wiremanVar3.attabal(this);
        }
    }

    public void dern() {
        this.f8183apical.clear();
        this.f8187cutely.clear();
        this.f8192taiyuan = false;
        this.value = 0;
        this.f8188dern = false;
        this.f8191saneness = false;
    }

    public String name() {
        String str;
        String strDovishness = this.f8193wireman.f8202saneness.dovishness();
        Type type = this.f8190marial;
        if (type == Type.LEFT || type == Type.RIGHT) {
            str = strDovishness + "_HORIZONTAL";
        } else {
            str = strDovishness + "_VERTICAL";
        }
        return str + ":" + this.f8190marial.name();
    }

    public void saneness(empress.wireman wiremanVar) {
        this.f8187cutely.add(wiremanVar);
        if (this.f8192taiyuan) {
            wiremanVar.attabal(wiremanVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8193wireman.f8202saneness.dovishness());
        sb.append(":");
        sb.append(this.f8190marial);
        sb.append("(");
        sb.append(this.f8192taiyuan ? Integer.valueOf(this.value) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8183apical.size());
        sb.append(":d=");
        sb.append(this.f8187cutely.size());
        sb.append(">");
        return sb.toString();
    }

    public void wireman(int i) {
        if (this.f8192taiyuan) {
            return;
        }
        this.f8192taiyuan = true;
        this.value = i;
        for (empress.wireman wiremanVar : this.f8187cutely) {
            wiremanVar.attabal(wiremanVar);
        }
    }
}
