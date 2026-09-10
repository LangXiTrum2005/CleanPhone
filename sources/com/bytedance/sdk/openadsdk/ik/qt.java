package com.bytedance.sdk.openadsdk.ik;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private JSONObject aw;
    private wjv bgr;
    private FilterWord bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18154co;
    private String qt;
    private String sf;
    private int slm;
    private int vr;
    public static FilterWord ri = new FilterWord("", "");
    public static int lr = 1;
    public static int ik = 2;
    public static int ka = 3;
    public static int fi = 4;
    private final Set<ik> di = new HashSet();
    private final Set<lr> xha = new HashSet();
    private final Set<ka> mj = new HashSet();
    private final Set<ri> jbs = new HashSet();

    public interface ik {
        void ri(FilterWord filterWord);
    }

    public interface ka {
        void ri(String str);
    }

    public interface lr {
        void ri(int i);
    }

    public interface ri {
        void ri(List<FilterWord> list);
    }

    private void qt() {
        Iterator<ik> it = this.di.iterator();
        while (it.hasNext()) {
            it.next().ri(this.bu);
        }
    }

    public void di() {
        Iterator<lr> it = this.xha.iterator();
        while (it.hasNext()) {
            it.next().ri(fi);
        }
    }

    public void fi() {
        Iterator<lr> it = this.xha.iterator();
        while (it.hasNext()) {
            it.next().ri(ik);
        }
    }

    public boolean ik() {
        FilterWord filterWord = this.bu;
        return (filterWord == null || filterWord.equals(ri)) ? false : true;
    }

    public boolean jbs() {
        return this.vr < this.slm;
    }

    public void ka() {
        wjv wjvVar;
        if (!ik() && !TextUtils.isEmpty(this.f18154co)) {
            this.bu = new FilterWord("0:00", this.f18154co);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.bu);
        if (!TextUtils.isEmpty(this.qt)) {
            if (TextUtils.isEmpty(this.f18154co)) {
                com.bytedance.sdk.openadsdk.ik.lr.ri().ri(this.qt, arrayList, this.sf);
            } else {
                if (this.aw == null && (wjvVar = this.bgr) != null) {
                    this.aw = wjvVar.aw(true);
                }
                com.bytedance.sdk.openadsdk.ik.lr.ri().ri(this.qt, arrayList, this.aw, this.f18154co, this.sf);
            }
        }
        Iterator<lr> it = this.xha.iterator();
        while (it.hasNext()) {
            it.next().ri(lr);
        }
        ri(ri);
        ik("");
    }

    public void lr(String str) {
        this.sf = str;
    }

    public int mj() {
        return this.vr;
    }

    public void ri() {
        this.di.clear();
        this.xha.clear();
        this.mj.clear();
        this.jbs.clear();
    }

    public String xha() {
        return this.f18154co;
    }

    public void ik(String str) {
        this.f18154co = str;
        Iterator<ka> it = this.mj.iterator();
        while (it.hasNext()) {
            it.next().ri(this.f18154co);
        }
    }

    public FilterWord lr() {
        return this.bu;
    }

    public void ri(String str) {
        this.qt = str;
    }

    public void ri(FilterWord filterWord) {
        this.bu = filterWord;
        qt();
    }

    public void ri(ik ikVar) {
        this.di.add(ikVar);
    }

    public void ri(lr lrVar) {
        this.xha.add(lrVar);
    }

    public void ri(ka kaVar) {
        this.mj.add(kaVar);
    }

    public void ri(ri riVar) {
        this.jbs.add(riVar);
    }

    public void ri(List<FilterWord> list) {
        Iterator<ri> it = this.jbs.iterator();
        while (it.hasNext()) {
            it.next().ri(list);
        }
    }

    public void ri(wjv wjvVar) {
        this.bgr = wjvVar;
    }

    public void ri(int i, int i2) {
        this.vr = i;
        this.slm = i2;
    }
}
