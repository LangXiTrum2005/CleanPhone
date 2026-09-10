package androidx.activity.contextaware;

import androidx.activity.ComponentActivity;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ContextAwareHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f3244a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ComponentActivity f3245b;
}
