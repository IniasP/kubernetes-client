
package io.fabric8.openshift.api.model.hive.metricsconfig.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "additionalClusterDeploymentLabels",
    "metricsWithDuration"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class MetricsConfig implements Editable<MetricsConfigBuilder> , KubernetesResource
{

    @JsonProperty("additionalClusterDeploymentLabels")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> additionalClusterDeploymentLabels = new LinkedHashMap<String, String>();
    @JsonProperty("metricsWithDuration")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MetricsWithDuration> metricsWithDuration = new ArrayList<MetricsWithDuration>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new LinkedHashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetricsConfig() {
    }

    public MetricsConfig(Map<String, String> additionalClusterDeploymentLabels, List<MetricsWithDuration> metricsWithDuration) {
        super();
        this.additionalClusterDeploymentLabels = additionalClusterDeploymentLabels;
        this.metricsWithDuration = metricsWithDuration;
    }

    @JsonProperty("additionalClusterDeploymentLabels")
    public Map<String, String> getAdditionalClusterDeploymentLabels() {
        return additionalClusterDeploymentLabels;
    }

    @JsonProperty("additionalClusterDeploymentLabels")
    public void setAdditionalClusterDeploymentLabels(Map<String, String> additionalClusterDeploymentLabels) {
        this.additionalClusterDeploymentLabels = additionalClusterDeploymentLabels;
    }

    @JsonProperty("metricsWithDuration")
    public List<MetricsWithDuration> getMetricsWithDuration() {
        return metricsWithDuration;
    }

    @JsonProperty("metricsWithDuration")
    public void setMetricsWithDuration(List<MetricsWithDuration> metricsWithDuration) {
        this.metricsWithDuration = metricsWithDuration;
    }

    @JsonIgnore
    public MetricsConfigBuilder edit() {
        return new MetricsConfigBuilder(this);
    }

    @JsonIgnore
    public MetricsConfigBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}