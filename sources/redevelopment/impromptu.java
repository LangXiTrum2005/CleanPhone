package redevelopment;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MaskKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<attabal<euhemerize.taiyuan, Path>> f36122attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<Mask> f36123dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<attabal<Integer, Integer>> f36124saneness;

    public impromptu(List<Mask> list) {
        this.f36123dern = list;
        this.f36122attabal = new ArrayList(list.size());
        this.f36124saneness = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f36122attabal.add(list.get(i).saneness().attabal());
            this.f36124saneness.add(list.get(i).dern().attabal());
        }
    }

    public List<attabal<euhemerize.taiyuan, Path>> attabal() {
        return this.f36122attabal;
    }

    public List<attabal<Integer, Integer>> dern() {
        return this.f36124saneness;
    }

    public List<Mask> saneness() {
        return this.f36123dern;
    }
}
