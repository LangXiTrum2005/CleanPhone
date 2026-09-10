package saneness;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface weimar {
    View a();

    void a(View view);

    void a(FrameLayout frameLayout);

    void a(FrameLayout frameLayout, Map map, Map map2);

    boolean b();

    View c();

    boolean d();

    void destroy();

    float e();

    ArrayList f();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Bundle getExtras();

    boolean getHasVideoContent();

    String getHeadline();

    bohunk getIcon();

    String getPrice();

    String getStore();

    void recordImpression();
}
