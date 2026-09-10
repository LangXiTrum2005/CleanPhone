package org.chromium.net;

import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import saneness.distortionist;

/* JADX INFO: loaded from: classes5.dex */
final class ExperimentalOptionsTranslatingCronetEngineBuilder extends ICronetEngineBuilder {
    private static final Set<Integer> SUPPORTED_OPTIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));
    private final ICronetEngineBuilder mDelegate;
    private final List<ExperimentalOptionsPatch> mExperimentalOptionsPatches = new ArrayList();
    private JSONObject mParsedExperimentalOptions;

    @FunctionalInterface
    public interface ExperimentalOptionsPatch {
        void applyTo(JSONObject jSONObject) throws JSONException;
    }

    public ExperimentalOptionsTranslatingCronetEngineBuilder(ICronetEngineBuilder iCronetEngineBuilder) {
        this.mDelegate = iCronetEngineBuilder;
    }

    public static /* synthetic */ void attabal(ConnectionMigrationOptions connectionMigrationOptions, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectCreateDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
        if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
            jSONObjectCreateDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
        }
        if (connectionMigrationOptions.getAllowServerMigration() != null) {
            jSONObjectCreateDefaultIfAbsent.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
        }
        if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
            jSONObjectCreateDefaultIfAbsent.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
        }
        if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
        }
        if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
            jSONObjectCreateDefaultIfAbsent.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
        }
        if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
        }
        if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
            jSONObjectCreateDefaultIfAbsent.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
            jSONObjectCreateDefaultIfAbsent.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
            boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
            if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                if (!zBooleanValue && zBooleanValue2) {
                    throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                if (zBooleanValue && zBooleanValue2) {
                    jSONObjectCreateDefaultIfAbsent.put("migrate_sessions_early_v2", true);
                    return;
                }
                jSONObjectCreateDefaultIfAbsent.put("migrate_sessions_early_v2", false);
            }
            jSONObjectCreateDefaultIfAbsent.put("allow_port_migration", zBooleanValue);
        }
    }

    private static JSONObject createDefaultIfAbsent(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Failed adding a default object for key [" + str + X3.j.e, e);
        }
    }

    public static /* synthetic */ void dern(DnsOptions dnsOptions, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectCreateDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "AsyncDNS");
        if (dnsOptions.getUseBuiltInDnsResolver() != null) {
            jSONObjectCreateDefaultIfAbsent.put(a.j, dnsOptions.getUseBuiltInDnsResolver());
        }
        JSONObject jSONObjectCreateDefaultIfAbsent2 = createDefaultIfAbsent(jSONObject, "StaleDNS");
        if (dnsOptions.getEnableStaleDns() != null) {
            jSONObjectCreateDefaultIfAbsent2.put(a.j, dnsOptions.getEnableStaleDns());
        }
        if (dnsOptions.getPersistHostCache() != null) {
            jSONObjectCreateDefaultIfAbsent2.put("persist_to_disk", dnsOptions.getPersistHostCache());
        }
        if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
            jSONObjectCreateDefaultIfAbsent2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
        }
        if (dnsOptions.getStaleDnsOptions() != null) {
            DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
            if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
            }
            if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
            }
            if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
            }
            if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
            }
        }
        JSONObject jSONObjectCreateDefaultIfAbsent3 = createDefaultIfAbsent(jSONObject, "QUIC");
        if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
            jSONObjectCreateDefaultIfAbsent3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
        }
    }

    private static JSONObject parseExperimentalOptions(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Experimental options parsing failed", e);
        }
    }

    public static /* synthetic */ void saneness(QuicOptions quicOptions, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectCreateDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
        if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent.put("host_whitelist", distortionist.attabal(",", quicOptions.getQuicHostAllowlist()));
        }
        if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent.put("quic_version", distortionist.attabal(",", quicOptions.getEnabledQuicVersions()));
        }
        if (!quicOptions.getConnectionOptions().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent.put("connection_options", distortionist.attabal(",", quicOptions.getConnectionOptions()));
        }
        if (!quicOptions.getClientConnectionOptions().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent.put("client_connection_options", distortionist.attabal(",", quicOptions.getClientConnectionOptions()));
        }
        if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent.put("set_quic_flags", distortionist.attabal(",", quicOptions.getExtraQuicheFlags()));
        }
        if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
            jSONObjectCreateDefaultIfAbsent.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
        }
        if (quicOptions.getHandshakeUserAgent() != null) {
            jSONObjectCreateDefaultIfAbsent.put("user_agent_id", quicOptions.getHandshakeUserAgent());
        }
        if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
            jSONObjectCreateDefaultIfAbsent.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (quicOptions.getEnableTlsZeroRtt() != null) {
            jSONObjectCreateDefaultIfAbsent.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
        }
        if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
        }
        if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
        }
        if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
            jSONObjectCreateDefaultIfAbsent.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
        }
        if (quicOptions.getCloseSessionsOnIpChange() != null) {
            jSONObjectCreateDefaultIfAbsent.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
        }
        if (quicOptions.getGoawaySessionsOnIpChange() != null) {
            jSONObjectCreateDefaultIfAbsent.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
        }
        if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
        }
        if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
            jSONObjectCreateDefaultIfAbsent.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
        }
        if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
            jSONObjectCreateDefaultIfAbsent.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        this.mDelegate.addPublicKeyPins(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.mDelegate.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ExperimentalCronetEngine build() {
        if (this.mParsedExperimentalOptions == null && this.mExperimentalOptionsPatches.isEmpty()) {
            return this.mDelegate.build();
        }
        if (this.mParsedExperimentalOptions == null) {
            this.mParsedExperimentalOptions = new JSONObject();
        }
        Iterator<ExperimentalOptionsPatch> it = this.mExperimentalOptionsPatches.iterator();
        while (it.hasNext()) {
            try {
                it.next().applyTo(this.mParsedExperimentalOptions);
            } catch (JSONException e) {
                throw new IllegalStateException("Unable to apply JSON patch!", e);
            }
        }
        this.mDelegate.setExperimentalOptions(this.mParsedExperimentalOptions.toString());
        return this.mDelegate.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableBrotli(boolean z) {
        this.mDelegate.enableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttp2(boolean z) {
        this.mDelegate.enableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.mDelegate.enableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.mDelegate.enableNetworkQualityEstimator(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableQuic(boolean z) {
        this.mDelegate.enableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableSdch(boolean z) {
        this.mDelegate.enableSdch(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        return this.mDelegate.getDefaultUserAgent();
    }

    public ICronetEngineBuilder getDelegate() {
        return this.mDelegate;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public Set<Integer> getSupportedConfigOptions() {
        return SUPPORTED_OPTIONS;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setConnectionMigrationOptions(final ConnectionMigrationOptions connectionMigrationOptions) {
        if (this.mDelegate.getSupportedConfigOptions().contains(1)) {
            this.mDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new ExperimentalOptionsPatch() { // from class: org.chromium.net.saneness
            @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
            public final void applyTo(JSONObject jSONObject) throws JSONException {
                ExperimentalOptionsTranslatingCronetEngineBuilder.attabal(connectionMigrationOptions, jSONObject);
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setDnsOptions(final DnsOptions dnsOptions) {
        if (this.mDelegate.getSupportedConfigOptions().contains(2)) {
            this.mDelegate.setDnsOptions(dnsOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new ExperimentalOptionsPatch() { // from class: org.chromium.net.attabal
            @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
            public final void applyTo(JSONObject jSONObject) throws JSONException {
                ExperimentalOptionsTranslatingCronetEngineBuilder.dern(dnsOptions, jSONObject);
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.mParsedExperimentalOptions = null;
            return this;
        }
        this.mParsedExperimentalOptions = parseExperimentalOptions(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.mDelegate.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setQuicOptions(final QuicOptions quicOptions) {
        if (this.mDelegate.getSupportedConfigOptions().contains(3)) {
            this.mDelegate.setQuicOptions(quicOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new ExperimentalOptionsPatch() { // from class: org.chromium.net.dern
            @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
            public final void applyTo(JSONObject jSONObject) throws JSONException {
                ExperimentalOptionsTranslatingCronetEngineBuilder.saneness(quicOptions, jSONObject);
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setStoragePath(String str) {
        this.mDelegate.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setThreadPriority(int i) {
        this.mDelegate.setThreadPriority(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setUserAgent(String str) {
        this.mDelegate.setUserAgent(str);
        return this;
    }
}
