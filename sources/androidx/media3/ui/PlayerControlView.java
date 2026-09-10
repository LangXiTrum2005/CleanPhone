package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] C1;
    public final ImageView A0;
    public long A1;
    public final ImageView B0;
    public boolean B1;
    public final ImageView C0;
    public final View D0;
    public final View E0;
    public final View F0;
    public final TextView G0;
    public final TextView H0;
    public final TimeBar I0;
    public final StringBuilder J0;
    public final Formatter K0;
    public final Timeline.Period L0;
    public final Timeline.Window M0;
    public final a N0;
    public final Drawable O0;
    public final Drawable P0;
    public final Drawable Q0;
    public final Drawable R0;
    public final Drawable S0;
    public final String T0;
    public final String U0;
    public final String V0;
    public final Drawable W0;
    public final Drawable X0;
    public final float Y0;
    public final float Z0;
    public final String a1;
    public final String b1;
    public final Drawable c1;
    public final Drawable d1;
    public final PlayerControlViewLayoutManager e0;
    public final String e1;
    public final Resources f0;
    public final String f1;
    public final ComponentListener g0;
    public final Drawable g1;
    public final CopyOnWriteArrayList h0;
    public final Drawable h1;
    public final RecyclerView i0;
    public final String i1;
    public final SettingsAdapter j0;
    public final String j1;
    public final PlaybackSpeedAdapter k0;
    public Player k1;
    public final TextTrackSelectionAdapter l0;
    public ProgressUpdateListener l1;
    public final AudioTrackSelectionAdapter m0;
    public OnFullScreenModeChangedListener m1;
    public final DefaultTrackNameProvider n0;
    public boolean n1;
    public final PopupWindow o0;
    public boolean o1;
    public final int p0;
    public boolean p1;
    public final ImageView q0;
    public boolean q1;
    public final ImageView r0;
    public boolean r1;
    public final ImageView s0;
    public boolean s1;
    public final View t0;
    public int t1;
    public final View u0;
    public int u1;
    public final TextView v0;
    public int v1;
    public final TextView w0;
    public long[] w1;
    public final ImageView x0;
    public boolean[] x1;
    public final ImageView y0;
    public final long[] y1;
    public final ImageView z0;
    public final boolean[] z1;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        public AudioTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void d(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.f7697c.setText(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_auto);
            Player player = PlayerControlView.this.k1;
            player.getClass();
            subSettingViewHolder.d.setVisibility(f(player.n()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new b(this, 0));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void e(String str) {
            PlayerControlView.this.j0.j[1] = str;
        }

        public final boolean f(TrackSelectionParameters trackSelectionParameters) {
            for (int i2 = 0; i2 < this.f7701i.size(); i2++) {
                if (trackSelectionParameters.r.containsKey(((TrackInformation) this.f7701i.get(i2)).f7698a.f5549b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void m(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.s1 = true;
            TextView textView = playerControlView.H0;
            if (textView != null) {
                textView.setText(Util.y(playerControlView.J0, playerControlView.K0, j));
            }
            playerControlView.e0.f();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.k1;
            if (player == null) {
                return;
            }
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.e0;
            playerControlViewLayoutManager.g();
            if (playerControlView.r0 == view) {
                if (player.k(9)) {
                    player.o();
                    return;
                }
                return;
            }
            if (playerControlView.q0 == view) {
                if (player.k(7)) {
                    player.g();
                    return;
                }
                return;
            }
            if (playerControlView.t0 == view) {
                if (player.getPlaybackState() == 4 || !player.k(12)) {
                    return;
                }
                player.w();
                return;
            }
            if (playerControlView.u0 == view) {
                if (player.k(11)) {
                    player.x();
                    return;
                }
                return;
            }
            if (playerControlView.s0 == view) {
                if (Util.Q(player, playerControlView.q1)) {
                    Util.B(player);
                    return;
                } else {
                    if (player.k(1)) {
                        player.pause();
                        return;
                    }
                    return;
                }
            }
            if (playerControlView.x0 == view) {
                if (player.k(15)) {
                    int repeatMode = player.getRepeatMode();
                    int i2 = playerControlView.v1;
                    for (int i3 = 1; i3 <= 2; i3++) {
                        int i4 = (repeatMode + i3) % 3;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2 || (i2 & 2) == 0) {
                                }
                            } else if ((i2 & 1) == 0) {
                            }
                        }
                        repeatMode = i4;
                    }
                    player.setRepeatMode(repeatMode);
                    return;
                }
                return;
            }
            if (playerControlView.y0 == view) {
                if (player.k(14)) {
                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            View view2 = playerControlView.D0;
            if (view2 == view) {
                playerControlViewLayoutManager.f();
                playerControlView.e(playerControlView.j0, view2);
                return;
            }
            View view3 = playerControlView.E0;
            if (view3 == view) {
                playerControlViewLayoutManager.f();
                playerControlView.e(playerControlView.k0, view3);
                return;
            }
            View view4 = playerControlView.F0;
            if (view4 == view) {
                playerControlViewLayoutManager.f();
                playerControlView.e(playerControlView.m0, view4);
                return;
            }
            ImageView imageView = playerControlView.A0;
            if (imageView == view) {
                playerControlViewLayoutManager.f();
                playerControlView.e(playerControlView.l0, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.B1) {
                playerControlView.e0.g();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(Player player, Player.Events events) {
            boolean zA = events.a(4, 5, 13);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (zA) {
                float[] fArr = PlayerControlView.C1;
                playerControlView.m();
            }
            if (events.a(4, 5, 7, 13)) {
                float[] fArr2 = PlayerControlView.C1;
                playerControlView.o();
            }
            if (events.a(8, 13)) {
                float[] fArr3 = PlayerControlView.C1;
                playerControlView.p();
            }
            if (events.a(9, 13)) {
                float[] fArr4 = PlayerControlView.C1;
                playerControlView.r();
            }
            if (events.a(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = PlayerControlView.C1;
                playerControlView.l();
            }
            if (events.a(11, 0, 13)) {
                float[] fArr6 = PlayerControlView.C1;
                playerControlView.s();
            }
            if (events.a(12, 13)) {
                float[] fArr7 = PlayerControlView.C1;
                playerControlView.n();
            }
            if (events.a(2, 13)) {
                float[] fArr8 = PlayerControlView.C1;
                playerControlView.t();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void r(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.H0;
            if (textView != null) {
                textView.setText(Util.y(playerControlView.J0, playerControlView.K0, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void s(long j, boolean z2) {
            Player player;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i2 = 0;
            playerControlView.s1 = false;
            if (!z2 && (player = playerControlView.k1) != null) {
                if (playerControlView.r1) {
                    if (player.k(17) && player.k(10)) {
                        Timeline currentTimeline = player.getCurrentTimeline();
                        int iO = currentTimeline.o();
                        while (true) {
                            long jT = Util.T(currentTimeline.m(i2, playerControlView.M0, 0L).f5519l);
                            if (j < jT) {
                                break;
                            }
                            if (i2 == iO - 1) {
                                j = jT;
                                break;
                            } else {
                                j -= jT;
                                i2++;
                            }
                        }
                        player.seekTo(i2, j);
                    }
                } else if (player.k(5)) {
                    player.seekTo(j);
                }
                playerControlView.o();
            }
            playerControlView.e0.g();
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void r(boolean z2);
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String[] f7691i;
        public final float[] j;
        public int k;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.f7691i = strArr;
            this.j = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f7691i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i2) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) viewHolder;
            String[] strArr = this.f7691i;
            if (i2 < strArr.length) {
                subSettingViewHolder.f7697c.setText(strArr[i2]);
            }
            if (i2 == this.k) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.d.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.d.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = this.X;
                    int i3 = playbackSpeedAdapter.k;
                    int i4 = i2;
                    PlayerControlView playerControlView = PlayerControlView.this;
                    if (i4 != i3) {
                        playerControlView.setPlaybackSpeed(playbackSpeedAdapter.j[i4]);
                    }
                    playerControlView.o0.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void a();
    }

    public final class SettingViewHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ int g = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f7693c;
        public final TextView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f7694e;

        public SettingViewHolder(View view) {
            super(view);
            if (Util.f5683a < 26) {
                view.setFocusable(true);
            }
            this.f7693c = (TextView) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_main_text);
            this.d = (TextView) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_sub_text);
            this.f7694e = (ImageView) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_icon);
            view.setOnClickListener(new b(this, 1));
        }
    }

    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String[] f7695i;
        public final String[] j;
        public final Drawable[] k;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.f7695i = strArr;
            this.j = new String[strArr.length];
            this.k = drawableArr;
        }

        public final boolean c(int i2) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.k1;
            if (player == null) {
                return false;
            }
            if (i2 != 0) {
                return i2 != 1 || (player.k(30) && playerControlView.k1.k(29));
            }
            return player.k(13);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f7695i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            SettingViewHolder settingViewHolder = (SettingViewHolder) viewHolder;
            if (c(i2)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.f7693c.setText(this.f7695i[i2]);
            String str = this.j[i2];
            TextView textView = settingViewHolder.d;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.k[i2];
            ImageView imageView = settingViewHolder.f7694e;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new SettingViewHolder(LayoutInflater.from(playerControlView.getContext()).inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f7697c;
        public final View d;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Util.f5683a < 26) {
                view.setFocusable(true);
            }
            this.f7697c = (TextView) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_text);
            this.d = view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_check);
        }
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        public TextTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i2) {
            super.onBindViewHolder(subSettingViewHolder, i2);
            if (i2 > 0) {
                TrackInformation trackInformation = (TrackInformation) this.f7701i.get(i2 - 1);
                subSettingViewHolder.d.setVisibility(trackInformation.f7698a.f5551e[trackInformation.f7699b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void d(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.f7697c.setText(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_none);
            int i2 = 0;
            for (int i3 = 0; i3 < this.f7701i.size(); i3++) {
                TrackInformation trackInformation = (TrackInformation) this.f7701i.get(i3);
                if (trackInformation.f7698a.f5551e[trackInformation.f7699b]) {
                    i2 = 4;
                    break;
                }
            }
            subSettingViewHolder.d.setVisibility(i2);
            subSettingViewHolder.itemView.setOnClickListener(new b(this, 2));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public final void e(String str) {
        }

        public final void f(List list) {
            boolean z2 = false;
            for (int i2 = 0; i2 < list.size(); i2++) {
                TrackInformation trackInformation = (TrackInformation) list.get(i2);
                if (trackInformation.f7698a.f5551e[trackInformation.f7699b]) {
                    z2 = true;
                    break;
                }
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.A0;
            if (imageView != null) {
                imageView.setImageDrawable(z2 ? playerControlView.c1 : playerControlView.d1);
                playerControlView.A0.setContentDescription(z2 ? playerControlView.e1 : playerControlView.f1);
            }
            this.f7701i = list;
        }
    }

    public static final class TrackInformation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Tracks.Group f7698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7700c;

        /* JADX WARN: Multi-variable type inference failed */
        public TrackInformation(Tracks tracks, int i2, int i3, String str) {
            this.f7698a = (Tracks.Group) tracks.f5547a.get(i2);
            this.f7699b = i3;
            this.f7700c = str;
        }
    }

    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f7701i = new ArrayList();

        public TrackSelectionAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i2) {
            final Player player = PlayerControlView.this.k1;
            if (player == null) {
                return;
            }
            if (i2 == 0) {
                d(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = (TrackInformation) this.f7701i.get(i2 - 1);
            final TrackGroup trackGroup = trackInformation.f7698a.f5549b;
            boolean z2 = player.n().r.get(trackGroup) != null && trackInformation.f7698a.f5551e[trackInformation.f7699b];
            subSettingViewHolder.f7697c.setText(trackInformation.f7700c);
            subSettingViewHolder.d.setVisibility(z2 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.TrackSelectionAdapter trackSelectionAdapter = this.X;
                    trackSelectionAdapter.getClass();
                    Player player2 = player;
                    if (player2.k(29)) {
                        TrackSelectionParameters.Builder builderA = player2.n().a();
                        PlayerControlView.TrackInformation trackInformation2 = trackInformation;
                        player2.u(builderA.e(new TrackSelectionOverride(trackGroup, ImmutableList.z(Integer.valueOf(trackInformation2.f7699b)))).f(trackInformation2.f7698a.f5549b.f5523c).a());
                        trackSelectionAdapter.e(trackInformation2.f7700c);
                        PlayerControlView.this.o0.dismiss();
                    }
                }
            });
        }

        public abstract void d(SubSettingViewHolder subSettingViewHolder);

        public abstract void e(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f7701i.isEmpty()) {
                return 0;
            }
            return this.f7701i.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void m(int i2);
    }

    static {
        MediaLibraryInfo.a("media3.ui");
        C1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControlView(Context context) {
        super(context, null, 0);
        int i2 = 4;
        int i3 = 1;
        this.q1 = true;
        this.t1 = 5000;
        this.v1 = 0;
        this.u1 = 200;
        LayoutInflater.from(context).inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        ComponentListener componentListener = new ComponentListener();
        this.g0 = componentListener;
        this.h0 = new CopyOnWriteArrayList();
        this.L0 = new Timeline.Period();
        this.M0 = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.J0 = sb;
        this.K0 = new Formatter(sb, Locale.getDefault());
        this.w1 = new long[0];
        this.x1 = new boolean[0];
        this.y1 = new long[0];
        this.z1 = new boolean[0];
        this.N0 = new a(this, 1);
        this.G0 = (TextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_duration);
        this.H0 = (TextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_subtitle);
        this.A0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_fullscreen);
        this.B0 = imageView2;
        b bVar = new b(this, i2);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(bVar);
        }
        ImageView imageView3 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_minimal_fullscreen);
        this.C0 = imageView3;
        b bVar2 = new b(this, i2);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(bVar2);
        }
        View viewFindViewById = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_settings);
        this.D0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener);
        }
        View viewFindViewById2 = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_playback_speed);
        this.E0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_audio_track);
        this.F0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        TimeBar timeBar = (TimeBar) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_progress);
        View viewFindViewById4 = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.I0 = timeBar;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context);
            defaultTimeBar.setId(com.charging.screenshow.battery.animations.themes.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.I0 = defaultTimeBar;
        } else {
            this.I0 = null;
        }
        TimeBar timeBar2 = this.I0;
        if (timeBar2 != null) {
            timeBar2.a(componentListener);
        }
        Resources resources = context.getResources();
        this.f0 = resources;
        ImageView imageView4 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_play_pause);
        this.s0 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        ImageView imageView5 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_prev);
        this.q0 = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_previous));
            imageView5.setOnClickListener(componentListener);
        }
        ImageView imageView6 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_next);
        this.r0 = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_next));
            imageView6.setOnClickListener(componentListener);
        }
        ThreadLocal threadLocal = ResourcesCompat.f4277a;
        Typeface typefaceD = context.isRestricted() ? null : ResourcesCompat.d(context, com.charging.screenshow.battery.animations.themes.R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        ImageView imageView7 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_rew);
        TextView textView = (TextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_simple_rewind));
            this.u0 = imageView7;
            this.w0 = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceD);
            this.w0 = textView;
            this.u0 = textView;
        } else {
            this.w0 = null;
            this.u0 = null;
        }
        View view = this.u0;
        if (view != null) {
            view.setOnClickListener(componentListener);
        }
        ImageView imageView8 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_simple_fastforward));
            this.t0 = imageView8;
            this.v0 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceD);
            this.v0 = textView2;
            this.t0 = textView2;
        } else {
            this.v0 = null;
            this.t0 = null;
        }
        View view2 = this.t0;
        if (view2 != null) {
            view2.setOnClickListener(componentListener);
        }
        ImageView imageView9 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_repeat_toggle);
        this.x0 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(componentListener);
        }
        ImageView imageView10 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_shuffle);
        this.y0 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(componentListener);
        }
        this.Y0 = resources.getInteger(com.charging.screenshow.battery.animations.themes.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.Z0 = resources.getInteger(com.charging.screenshow.battery.animations.themes.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_vr);
        this.z0 = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_vr));
            k(imageView11, false);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(this);
        this.e0 = playerControlViewLayoutManager;
        playerControlViewLayoutManager.C = true;
        SettingsAdapter settingsAdapter = new SettingsAdapter(new String[]{resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_playback_speed), resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_speed), Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_audiotrack)});
        this.j0 = settingsAdapter;
        this.p0 = resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.i0 = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.o0 = popupWindow;
        if (Util.f5683a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(componentListener);
        this.B1 = true;
        this.n0 = new DefaultTrackNameProvider(getResources());
        this.c1 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_subtitle_on);
        this.d1 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_subtitle_off);
        this.e1 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_cc_enabled_description);
        this.f1 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_cc_disabled_description);
        this.l0 = new TextTrackSelectionAdapter();
        this.m0 = new AudioTrackSelectionAdapter();
        this.k0 = new PlaybackSpeedAdapter(resources.getStringArray(com.charging.screenshow.battery.animations.themes.R.array.exo_controls_playback_speeds), C1);
        this.O0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_play);
        this.P0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_pause);
        this.g1 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_fullscreen_exit);
        this.h1 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_fullscreen_enter);
        this.Q0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_repeat_off);
        this.R0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_repeat_one);
        this.S0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_repeat_all);
        this.W0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_shuffle_on);
        this.X0 = Util.r(context, resources, com.charging.screenshow.battery.animations.themes.R.drawable.exo_styled_controls_shuffle_off);
        this.i1 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_fullscreen_exit_description);
        this.j1 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_fullscreen_enter_description);
        this.T0 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_repeat_off_description);
        this.U0 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_repeat_one_description);
        this.V0 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_repeat_all_description);
        this.a1 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_shuffle_on_description);
        this.b1 = resources.getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager.h((ViewGroup) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager.h(this.t0, true);
        playerControlViewLayoutManager.h(this.u0, true);
        playerControlViewLayoutManager.h(imageView5, true);
        playerControlViewLayoutManager.h(imageView6, true);
        playerControlViewLayoutManager.h(imageView10, false);
        playerControlViewLayoutManager.h(imageView, false);
        playerControlViewLayoutManager.h(imageView11, false);
        playerControlViewLayoutManager.h(imageView9, this.v1 != 0);
        addOnLayoutChangeListener(new g(this, i3));
    }

    public static void a(PlayerControlView playerControlView) {
        if (playerControlView.m1 == null) {
            return;
        }
        boolean z2 = playerControlView.n1;
        playerControlView.n1 = !z2;
        String str = playerControlView.j1;
        Drawable drawable = playerControlView.h1;
        String str2 = playerControlView.i1;
        Drawable drawable2 = playerControlView.g1;
        ImageView imageView = playerControlView.B0;
        if (imageView != null) {
            if (z2) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z3 = playerControlView.n1;
        ImageView imageView2 = playerControlView.C0;
        if (imageView2 != null) {
            if (z3) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = playerControlView.m1;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.r(playerControlView.n1);
        }
    }

    public static boolean c(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int iO;
        if (player.k(17) && (iO = (currentTimeline = player.getCurrentTimeline()).o()) > 1 && iO <= 100) {
            for (int i2 = 0; i2 < iO; i2++) {
                if (currentTimeline.m(i2, window, 0L).f5519l != -9223372036854775807L) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player = this.k1;
        if (player == null || !player.k(13)) {
            return;
        }
        Player player2 = this.k1;
        player2.c(new PlaybackParameters(f, player2.getPlaybackParameters().f5495b));
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.k1;
        if (player == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (player.getPlaybackState() != 4 && player.k(12)) {
                    player.w();
                }
            } else if (keyCode == 89 && player.k(11)) {
                player.x();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (Util.Q(player, this.q1)) {
                        Util.B(player);
                    } else if (player.k(1)) {
                        player.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            Util.B(player);
                        } else if (keyCode == 127) {
                            int i2 = Util.f5683a;
                            if (player.k(1)) {
                                player.pause();
                            }
                        }
                    } else if (player.k(7)) {
                        player.g();
                    }
                } else if (player.k(9)) {
                    player.o();
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(RecyclerView.Adapter adapter, View view) {
        this.i0.setAdapter(adapter);
        q();
        this.B1 = false;
        PopupWindow popupWindow = this.o0;
        popupWindow.dismiss();
        this.B1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i2 = this.p0;
        popupWindow.showAsDropDown(view, width - i2, (-popupWindow.getHeight()) - i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList f(Tracks tracks, int i2) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList immutableList = tracks.f5547a;
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            Tracks.Group group = (Tracks.Group) immutableList.get(i3);
            if (group.f5549b.f5523c == i2) {
                for (int i4 = 0; i4 < group.f5548a; i4++) {
                    if (group.b(i4)) {
                        Format formatA = group.a(i4);
                        if ((formatA.f5409e & 2) == 0) {
                            builder.h(new TrackInformation(tracks, i3, i4, this.n0.a(formatA)));
                        }
                    }
                }
            }
        }
        return builder.j();
    }

    public final void g() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.e0;
        int i2 = playerControlViewLayoutManager.f7715z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        playerControlViewLayoutManager.f();
        if (!playerControlViewLayoutManager.C) {
            playerControlViewLayoutManager.i(2);
        } else if (playerControlViewLayoutManager.f7715z == 1) {
            playerControlViewLayoutManager.m.start();
        } else {
            playerControlViewLayoutManager.f7711n.start();
        }
    }

    public Player getPlayer() {
        return this.k1;
    }

    public int getRepeatToggleModes() {
        return this.v1;
    }

    public boolean getShowShuffleButton() {
        return this.e0.b(this.y0);
    }

    public boolean getShowSubtitleButton() {
        return this.e0.b(this.A0);
    }

    public int getShowTimeoutMs() {
        return this.t1;
    }

    public boolean getShowVrButton() {
        return this.e0.b(this.z0);
    }

    public final boolean h() {
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.e0;
        return playerControlViewLayoutManager.f7715z == 0 && playerControlViewLayoutManager.f7704a.i();
    }

    public final boolean i() {
        return getVisibility() == 0;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.Y0 : this.Z0);
    }

    public final void l() {
        boolean zK;
        boolean zK2;
        boolean zK3;
        boolean zK4;
        boolean zK5;
        if (i() && this.o1) {
            Player player = this.k1;
            if (player != null) {
                zK = (this.p1 && c(player, this.M0)) ? player.k(10) : player.k(5);
                zK3 = player.k(7);
                zK4 = player.k(11);
                zK5 = player.k(12);
                zK2 = player.k(9);
            } else {
                zK = false;
                zK2 = false;
                zK3 = false;
                zK4 = false;
                zK5 = false;
            }
            Resources resources = this.f0;
            View view = this.u0;
            if (zK4) {
                Player player2 = this.k1;
                int iA = (int) ((player2 != null ? player2.A() : 5000L) / 1000);
                TextView textView = this.w0;
                if (textView != null) {
                    textView.setText(String.valueOf(iA));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(com.charging.screenshow.battery.animations.themes.R.plurals.exo_controls_rewind_by_amount_description, iA, Integer.valueOf(iA)));
                }
            }
            View view2 = this.t0;
            if (zK5) {
                Player player3 = this.k1;
                int iT = (int) ((player3 != null ? player3.t() : MBInterstitialActivity.WEB_LOAD_TIME) / 1000);
                TextView textView2 = this.v0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iT));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(com.charging.screenshow.battery.animations.themes.R.plurals.exo_controls_fastforward_by_amount_description, iT, Integer.valueOf(iT)));
                }
            }
            k(this.q0, zK3);
            k(view, zK4);
            k(view2, zK5);
            k(this.r0, zK2);
            TimeBar timeBar = this.I0;
            if (timeBar != null) {
                timeBar.setEnabled(zK);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    public final void m() {
        ImageView imageView;
        boolean z2;
        if (i() && this.o1 && (imageView = this.s0) != null) {
            boolean zQ = Util.Q(this.k1, this.q1);
            Drawable drawable = zQ ? this.O0 : this.P0;
            int i2 = zQ ? com.charging.screenshow.battery.animations.themes.R.string.exo_controls_play_description : com.charging.screenshow.battery.animations.themes.R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f0.getString(i2));
            Player player = this.k1;
            if (player != null) {
                z2 = true;
                if (!player.k(1) || (this.k1.k(17) && this.k1.getCurrentTimeline().p())) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            k(imageView, z2);
        }
    }

    public final void n() {
        PlaybackSpeedAdapter playbackSpeedAdapter;
        Player player = this.k1;
        if (player == null) {
            return;
        }
        float f = player.getPlaybackParameters().f5494a;
        float f2 = Float.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            playbackSpeedAdapter = this.k0;
            float[] fArr = playbackSpeedAdapter.j;
            if (i2 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i2]);
            if (fAbs < f2) {
                i3 = i2;
                f2 = fAbs;
            }
            i2++;
        }
        playbackSpeedAdapter.k = i3;
        String str = playbackSpeedAdapter.f7691i[i3];
        SettingsAdapter settingsAdapter = this.j0;
        settingsAdapter.j[0] = str;
        k(this.D0, settingsAdapter.c(1) || settingsAdapter.c(0));
    }

    public final void o() {
        long contentPosition;
        long jV;
        if (i() && this.o1) {
            Player player = this.k1;
            if (player == null || !player.k(16)) {
                contentPosition = 0;
                jV = 0;
            } else {
                contentPosition = player.getContentPosition() + this.A1;
                jV = player.v() + this.A1;
            }
            TextView textView = this.H0;
            if (textView != null && !this.s1) {
                textView.setText(Util.y(this.J0, this.K0, contentPosition));
            }
            TimeBar timeBar = this.I0;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                timeBar.setBufferedPosition(jV);
            }
            ProgressUpdateListener progressUpdateListener = this.l1;
            if (progressUpdateListener != null) {
                progressUpdateListener.a();
            }
            a aVar = this.N0;
            removeCallbacks(aVar);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player != null && player.isPlaying()) {
                long jMin = Math.min(timeBar != null ? timeBar.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f = player.getPlaybackParameters().f5494a;
                postDelayed(aVar, Util.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.u1, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(aVar, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.e0;
        playerControlViewLayoutManager.f7704a.addOnLayoutChangeListener(playerControlViewLayoutManager.x);
        this.o1 = true;
        if (h()) {
            playerControlViewLayoutManager.g();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.e0;
        playerControlViewLayoutManager.f7704a.removeOnLayoutChangeListener(playerControlViewLayoutManager.x);
        this.o1 = false;
        removeCallbacks(this.N0);
        playerControlViewLayoutManager.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        View view = this.e0.f7705b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void p() {
        ImageView imageView;
        if (i() && this.o1 && (imageView = this.x0) != null) {
            if (this.v1 == 0) {
                k(imageView, false);
                return;
            }
            Player player = this.k1;
            String str = this.T0;
            Drawable drawable = this.Q0;
            if (player == null || !player.k(15)) {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, true);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.R0);
                imageView.setContentDescription(this.U0);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.S0);
                imageView.setContentDescription(this.V0);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.i0;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i2 = this.p0;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i2 * 2));
        PopupWindow popupWindow = this.o0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i2 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.o1 && (imageView = this.y0) != null) {
            Player player = this.k1;
            if (!this.e0.b(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.b1;
            Drawable drawable = this.X0;
            if (player == null || !player.k(14)) {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, true);
            if (player.getShuffleModeEnabled()) {
                drawable = this.W0;
            }
            imageView.setImageDrawable(drawable);
            if (player.getShuffleModeEnabled()) {
                str = this.a1;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.media3.common.AdPlaybackState] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.common.Timeline$Period] */
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
    public final void s() {
        long jI;
        int i2;
        ?? r24;
        boolean z2;
        ?? r2;
        boolean[] zArr;
        boolean z3;
        Player player = this.k1;
        if (player == null) {
            return;
        }
        boolean z4 = this.p1;
        boolean z5 = false;
        boolean z6 = true;
        Timeline.Window window = this.M0;
        this.r1 = z4 && c(player, window);
        long j = 0;
        this.A1 = 0L;
        Timeline currentTimeline = player.k(17) ? player.getCurrentTimeline() : Timeline.f5507a;
        long j2 = -9223372036854775807L;
        if (currentTimeline.p()) {
            if (player.k(16)) {
                long jR = player.r();
                if (jR != -9223372036854775807L) {
                    jI = Util.I(jR);
                } else {
                    jI = 0;
                }
            } else {
                jI = 0;
            }
            i2 = 0;
        } else {
            int iF = player.f();
            boolean z7 = this.r1;
            int i3 = z7 ? 0 : iF;
            int iO = z7 ? currentTimeline.o() - 1 : iF;
            i2 = 0;
            long j3 = 0;
            ?? r3 = currentTimeline;
            while (i3 <= iO) {
                long j4 = j;
                if (i3 == iF) {
                    this.A1 = Util.T(j3);
                }
                r3.n(i3, window);
                if (window.f5519l == j2) {
                    Assertions.e(this.r1 ^ z6);
                    break;
                }
                int i4 = window.m;
                ?? r4 = r3;
                while (i4 <= window.f5520n) {
                    ?? r7 = this.L0;
                    r4.f(i4, r7, z5);
                    long j5 = j2;
                    AdPlaybackState adPlaybackState = r7.g;
                    adPlaybackState.getClass();
                    long j6 = j4;
                    ?? r5 = r4;
                    for (?? r10 = z5; r10 < adPlaybackState.f5368a; r10++) {
                        r7.d(r10);
                        long j7 = r7.f5511e;
                        if (j7 >= j6) {
                            long[] jArr = this.w1;
                            if (i2 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.w1 = Arrays.copyOf(jArr, length);
                                this.x1 = Arrays.copyOf(this.x1, length);
                            }
                            this.w1[i2] = Util.T(j7 + j3);
                            boolean[] zArr2 = this.x1;
                            AdPlaybackState.AdGroup adGroupA = r7.g.a(r10);
                            int i5 = adGroupA.f5370a;
                            if (i5 != -1) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i5) {
                                        r2 = r5;
                                        zArr = zArr2;
                                        r24 = r2;
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i7 = adGroupA.f5373e[i6];
                                    ?? r25 = r2;
                                    z2 = true;
                                    if (i7 == 0) {
                                        r2 = r5;
                                    } else if (i7 != 1) {
                                        i6++;
                                        zArr2 = zArr;
                                        r2 = r25;
                                    }
                                    z3 = true;
                                    r24 = r25;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r24 = r5;
                            z2 = true;
                            z3 = true;
                            zArr[i2] = !z3;
                            i2++;
                        } else {
                            r24 = r5;
                            z2 = true;
                        }
                        z6 = z2;
                        iF = iF;
                        r5 = r24;
                    }
                    i4++;
                    j2 = j5;
                    j4 = j6;
                    r4 = r5;
                    z5 = false;
                }
                j3 += window.f5519l;
                i3++;
                z6 = z6;
                j = j4;
                r3 = r4;
                z5 = false;
            }
            jI = j3;
        }
        long jT = Util.T(jI);
        TextView textView = this.G0;
        if (textView != null) {
            textView.setText(Util.y(this.J0, this.K0, jT));
        }
        TimeBar timeBar = this.I0;
        if (timeBar != null) {
            timeBar.setDuration(jT);
            long[] jArr2 = this.y1;
            int length2 = jArr2.length;
            int i8 = i2 + length2;
            long[] jArr3 = this.w1;
            if (i8 > jArr3.length) {
                this.w1 = Arrays.copyOf(jArr3, i8);
                this.x1 = Arrays.copyOf(this.x1, i8);
            }
            System.arraycopy(jArr2, 0, this.w1, i2, length2);
            System.arraycopy(this.z1, 0, this.x1, i2, length2);
            timeBar.b(this.w1, this.x1, i8);
        }
        o();
    }

    public void setAnimationEnabled(boolean z2) {
        this.e0.C = z2;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.m1 = onFullScreenModeChangedListener;
        boolean z2 = onFullScreenModeChangedListener != null;
        ImageView imageView = this.B0;
        if (imageView != null) {
            if (z2) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z3 = onFullScreenModeChangedListener != null;
        ImageView imageView2 = this.C0;
        if (imageView2 == null) {
            return;
        }
        if (z3) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(Player player) {
        Assertions.e(Looper.myLooper() == Looper.getMainLooper());
        Assertions.b(player == null || player.m() == Looper.getMainLooper());
        Player player2 = this.k1;
        if (player2 == player) {
            return;
        }
        ComponentListener componentListener = this.g0;
        if (player2 != null) {
            player2.j(componentListener);
        }
        this.k1 = player;
        if (player != null) {
            player.l(componentListener);
        }
        j();
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
        this.l1 = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i2) {
        this.v1 = i2;
        Player player = this.k1;
        if (player != null && player.k(15)) {
            int repeatMode = this.k1.getRepeatMode();
            if (i2 == 0 && repeatMode != 0) {
                this.k1.setRepeatMode(0);
            } else if (i2 == 1 && repeatMode == 2) {
                this.k1.setRepeatMode(1);
            } else if (i2 == 2 && repeatMode == 1) {
                this.k1.setRepeatMode(2);
            }
        }
        this.e0.h(this.x0, i2 != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.e0.h(this.t0, z2);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z2) {
        this.p1 = z2;
        s();
    }

    public void setShowNextButton(boolean z2) {
        this.e0.h(this.r0, z2);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        this.q1 = z2;
        m();
    }

    public void setShowPreviousButton(boolean z2) {
        this.e0.h(this.q0, z2);
        l();
    }

    public void setShowRewindButton(boolean z2) {
        this.e0.h(this.u0, z2);
        l();
    }

    public void setShowShuffleButton(boolean z2) {
        this.e0.h(this.y0, z2);
        r();
    }

    public void setShowSubtitleButton(boolean z2) {
        this.e0.h(this.A0, z2);
    }

    public void setShowTimeoutMs(int i2) {
        this.t1 = i2;
        if (h()) {
            this.e0.g();
        }
    }

    public void setShowVrButton(boolean z2) {
        this.e0.h(this.z0, z2);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.u1 = Util.j(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.z0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            k(imageView, onClickListener != null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        TextTrackSelectionAdapter textTrackSelectionAdapter = this.l0;
        textTrackSelectionAdapter.getClass();
        List list = Collections.EMPTY_LIST;
        textTrackSelectionAdapter.f7701i = list;
        AudioTrackSelectionAdapter audioTrackSelectionAdapter = this.m0;
        audioTrackSelectionAdapter.getClass();
        audioTrackSelectionAdapter.f7701i = list;
        Player player = this.k1;
        ImageView imageView = this.A0;
        if (player != null && player.k(30) && this.k1.k(29)) {
            Tracks tracksD = this.k1.d();
            ImmutableList immutableListF = f(tracksD, 1);
            audioTrackSelectionAdapter.f7701i = immutableListF;
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player2 = playerControlView.k1;
            player2.getClass();
            TrackSelectionParameters trackSelectionParametersN = player2.n();
            boolean zIsEmpty = immutableListF.isEmpty();
            SettingsAdapter settingsAdapter = playerControlView.j0;
            if (zIsEmpty) {
                settingsAdapter.j[1] = playerControlView.getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_none);
            } else if (audioTrackSelectionAdapter.f(trackSelectionParametersN)) {
                for (int i2 = 0; i2 < immutableListF.size(); i2++) {
                    TrackInformation trackInformation = (TrackInformation) immutableListF.get(i2);
                    if (trackInformation.f7698a.f5551e[trackInformation.f7699b]) {
                        settingsAdapter.j[1] = trackInformation.f7700c;
                        break;
                    }
                }
            } else {
                settingsAdapter.j[1] = playerControlView.getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_auto);
            }
            if (this.e0.b(imageView)) {
                textTrackSelectionAdapter.f(f(tracksD, 3));
            } else {
                textTrackSelectionAdapter.f(ImmutableList.x());
            }
        }
        k(imageView, textTrackSelectionAdapter.getItemCount() > 0);
        SettingsAdapter settingsAdapter2 = this.j0;
        k(this.D0, settingsAdapter2.c(1) || settingsAdapter2.c(0));
    }
}
