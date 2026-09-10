package czestochowa;

import android.util.Pair;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* JADX INFO: compiled from: DesignTool.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final HashMap<Pair<Integer, Integer>, String> f25024beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final HashMap<String, String> f25025competently;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MotionLayout f25026attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f25029saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f25027dern = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f25030wireman = -1;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f25028marial = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f25024beachfront = map;
        HashMap<String, String> map2 = new HashMap<>();
        f25025competently = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public saneness(MotionLayout motionLayout) {
        this.f25026attabal = motionLayout;
    }
}
