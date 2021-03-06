/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN value.
     * The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     * <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script ID or
     * ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot
     * be changed once the fleet is created.
     * </p>
     */
    private String scriptId;
    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.
     * </p>
     */
    private String serverLaunchPath;
    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     */
    private String serverLaunchParameters;
    /**
     * <p>
     * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     */
    private java.util.List<String> logPaths;
    /**
     * <p>
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     * computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity.
     * Amazon GameLift supports the following EC2 instance types. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     */
    private String eC2InstanceType;
    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access game sessions that are running on
     * the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the
     * fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges
     * for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
     * </p>
     */
    private java.util.List<IpPermission> eC2InboundPermissions;
    /**
     * <p>
     * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using
     * <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change. You can
     * also set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     */
    private String newGameSessionProtectionPolicy;
    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime script. The runtime configuration defines the server executables or launch
     * script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a
     * fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails
     * with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>, although requests that contain values for these parameters instead of a
     * runtime configuration will continue to work.) This parameter is required unless the parameters
     * <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced
     * these parameters, but fleets that use them will continue to work.
     * </p>
     */
    private RuntimeConfiguration runtimeConfiguration;
    /**
     * <p>
     * A policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     */
    private ResourceCreationLimitPolicy resourceCreationLimitPolicy;
    /**
     * <p>
     * The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all
     * fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A
     * fleet can only be included in one metric group at a time.
     * </p>
     */
    private java.util.List<String> metricGroups;
    /**
     * <p>
     * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You
     * can find your account ID in the AWS Management Console under account settings.
     * </p>
     */
    private String peerVpcAwsAccountId;
    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     */
    private String peerVpcId;
    /**
     * <p>
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     * <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on the
     * instance type selected for this fleet. Learn more about <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>.
     * </p>
     */
    private String fleetType;
    /**
     * <p>
     * A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance role
     * ARN allow applications that are running on the fleet's instances to assume the role. Learn more about using
     * on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>. To call this operation with instance role ARN, you must have IAM
     * PassRole permissions. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM policy
     * examples for GameLift</a>.
     * </p>
     */
    private String instanceRoleArn;
    /**
     * <p>
     * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting
     * traffic between game clients and game servers running on GameLift. If this parameter is not specified, the
     * default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is created. Learn more at
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     * >Securing Client/Server Communication</a>.
     * </p>
     * <p>
     * Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS global
     * partition but not in all other partitions. When working in a partition that does not support this feature, a
     * request for a new fleet with certificate generation results fails with a 4xx unsupported Region error.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     */
    private CertificateConfiguration certificateConfiguration;
    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     * 
     * @param description
     *        A human-readable description of a fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     * 
     * @return A human-readable description of a fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     * 
     * @param description
     *        A human-readable description of a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN value.
     * The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     * <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     * 
     * @param buildId
     *        A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN
     *        value. The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     *        <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN value.
     * The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     * <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     * 
     * @return A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN
     *         value. The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     *         <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN value.
     * The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     * <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     * 
     * @param buildId
     *        A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN
     *        value. The custom game server build must have been successfully uploaded to Amazon GameLift and be in a
     *        <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script ID or
     * ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot
     * be changed once the fleet is created.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script
     *        ID or ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet
     *        setting cannot be changed once the fleet is created.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script ID or
     * ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot
     * be changed once the fleet is created.
     * </p>
     * 
     * @return A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script
     *         ID or ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet
     *         setting cannot be changed once the fleet is created.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script ID or
     * ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot
     * be changed once the fleet is created.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script
     *        ID or ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet
     *        setting cannot be changed once the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withScriptId(String scriptId) {
        setScriptId(scriptId);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.
     * </p>
     * 
     * @param serverLaunchPath
     *        This parameter is no longer used. Instead, specify a server launch path using the
     *        <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.
     */

    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.
     * </p>
     * 
     * @return This parameter is no longer used. Instead, specify a server launch path using the
     *         <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch
     *         parameters instead of a runtime configuration will continue to work.
     */

    public String getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.
     * </p>
     * 
     * @param serverLaunchPath
     *        This parameter is no longer used. Instead, specify a server launch path using the
     *        <code>RuntimeConfiguration</code> parameter. Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withServerLaunchPath(String serverLaunchPath) {
        setServerLaunchPath(serverLaunchPath);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @param serverLaunchParameters
     *        This parameter is no longer used. Instead, specify server launch parameters in the
     *        <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.)
     */

    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @return This parameter is no longer used. Instead, specify server launch parameters in the
     *         <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *         parameters instead of a runtime configuration will continue to work.)
     */

    public String getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @param serverLaunchParameters
     *        This parameter is no longer used. Instead, specify server launch parameters in the
     *        <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withServerLaunchParameters(String serverLaunchParameters) {
        setServerLaunchParameters(serverLaunchParameters);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * 
     * @return This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a
     *         server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *         or more directory paths in <code>logParameters</code>. See more information in the <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *         >Server API Reference</a>.
     */

    public java.util.List<String> getLogPaths() {
        return logPaths;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * 
     * @param logPaths
     *        This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a
     *        server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *        or more directory paths in <code>logParameters</code>. See more information in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *        >Server API Reference</a>.
     */

    public void setLogPaths(java.util.Collection<String> logPaths) {
        if (logPaths == null) {
            this.logPaths = null;
            return;
        }

        this.logPaths = new java.util.ArrayList<String>(logPaths);
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogPaths(java.util.Collection)} or {@link #withLogPaths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param logPaths
     *        This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a
     *        server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *        or more directory paths in <code>logParameters</code>. See more information in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *        >Server API Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLogPaths(String... logPaths) {
        if (this.logPaths == null) {
            setLogPaths(new java.util.ArrayList<String>(logPaths.length));
        }
        for (String ele : logPaths) {
            this.logPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * 
     * @param logPaths
     *        This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a
     *        server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *        or more directory paths in <code>logParameters</code>. See more information in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *        >Server API Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLogPaths(java.util.Collection<String> logPaths) {
        setLogPaths(logPaths);
        return this;
    }

    /**
     * <p>
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     * computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity.
     * Amazon GameLift supports the following EC2 instance types. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines
     *        the computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     * computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity.
     * Amazon GameLift supports the following EC2 instance types. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @return The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines
     *         the computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *         capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     * computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity.
     * Amazon GameLift supports the following EC2 instance types. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines
     *        the computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public CreateFleetRequest withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     * computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity.
     * Amazon GameLift supports the following EC2 instance types. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines
     *        the computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        withEC2InstanceType(eC2InstanceType);
    }

    /**
     * <p>
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     * computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity.
     * Amazon GameLift supports the following EC2 instance types. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines
     *        the computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. Amazon GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public CreateFleetRequest withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
        return this;
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access game sessions that are running on
     * the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the
     * fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges
     * for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
     * </p>
     * 
     * @return Range of IP addresses and port settings that permit inbound traffic to access game sessions that are
     *         running on the fleet. For fleets using a custom game build, this parameter is required before game
     *         sessions running on the fleet can accept connections. For Realtime Servers fleets, Amazon GameLift
     *         automatically sets TCP and UDP ranges for use by the Realtime servers. You can specify multiple
     *         permission settings or add more by updating the fleet.
     */

    public java.util.List<IpPermission> getEC2InboundPermissions() {
        return eC2InboundPermissions;
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access game sessions that are running on
     * the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the
     * fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges
     * for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        Range of IP addresses and port settings that permit inbound traffic to access game sessions that are
     *        running on the fleet. For fleets using a custom game build, this parameter is required before game
     *        sessions running on the fleet can accept connections. For Realtime Servers fleets, Amazon GameLift
     *        automatically sets TCP and UDP ranges for use by the Realtime servers. You can specify multiple permission
     *        settings or add more by updating the fleet.
     */

    public void setEC2InboundPermissions(java.util.Collection<IpPermission> eC2InboundPermissions) {
        if (eC2InboundPermissions == null) {
            this.eC2InboundPermissions = null;
            return;
        }

        this.eC2InboundPermissions = new java.util.ArrayList<IpPermission>(eC2InboundPermissions);
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access game sessions that are running on
     * the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the
     * fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges
     * for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2InboundPermissions(java.util.Collection)} or
     * {@link #withEC2InboundPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        Range of IP addresses and port settings that permit inbound traffic to access game sessions that are
     *        running on the fleet. For fleets using a custom game build, this parameter is required before game
     *        sessions running on the fleet can accept connections. For Realtime Servers fleets, Amazon GameLift
     *        automatically sets TCP and UDP ranges for use by the Realtime servers. You can specify multiple permission
     *        settings or add more by updating the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withEC2InboundPermissions(IpPermission... eC2InboundPermissions) {
        if (this.eC2InboundPermissions == null) {
            setEC2InboundPermissions(new java.util.ArrayList<IpPermission>(eC2InboundPermissions.length));
        }
        for (IpPermission ele : eC2InboundPermissions) {
            this.eC2InboundPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access game sessions that are running on
     * the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the
     * fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges
     * for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        Range of IP addresses and port settings that permit inbound traffic to access game sessions that are
     *        running on the fleet. For fleets using a custom game build, this parameter is required before game
     *        sessions running on the fleet can accept connections. For Realtime Servers fleets, Amazon GameLift
     *        automatically sets TCP and UDP ranges for use by the Realtime servers. You can specify multiple permission
     *        settings or add more by updating the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withEC2InboundPermissions(java.util.Collection<IpPermission> eC2InboundPermissions) {
        setEC2InboundPermissions(eC2InboundPermissions);
        return this;
    }

    /**
     * <p>
     * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using
     * <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change. You can
     * also set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        A game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change.
     *        You can also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using
     * <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change. You can
     * also set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *         instances in this fleet default to no protection. You can change a fleet's protection policy using
     *         <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change.
     *         You can also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *         during a scale-down event.
     *         </p>
     *         </li>
     * @see ProtectionPolicy
     */

    public String getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using
     * <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change. You can
     * also set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        A game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change.
     *        You can also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public CreateFleetRequest withNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using
     * <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change. You can
     * also set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        A game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change.
     *        You can also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        withNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
    }

    /**
     * <p>
     * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using
     * <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change. You can
     * also set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        A game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        <a>UpdateFleetAttributes</a>, but this change will only affect sessions created after the policy change.
     *        You can also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public CreateFleetRequest withNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime script. The runtime configuration defines the server executables or launch
     * script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a
     * fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails
     * with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>, although requests that contain values for these parameters instead of a
     * runtime configuration will continue to work.) This parameter is required unless the parameters
     * <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced
     * these parameters, but fleets that use them will continue to work.
     * </p>
     * 
     * @param runtimeConfiguration
     *        Instructions for launching server processes on each instance in the fleet. Server processes run either a
     *        custom game build executable or a Realtime script. The runtime configuration defines the server
     *        executables or launch script file, launch parameters, and the number of processes to run concurrently on
     *        each instance. When creating a fleet, the runtime configuration must have at least one server process
     *        configuration; otherwise the request fails with an invalid request exception. (This parameter replaces the
     *        parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>, although requests that
     *        contain values for these parameters instead of a runtime configuration will continue to work.) This
     *        parameter is required unless the parameters <code>ServerLaunchPath</code> and
     *        <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced these parameters, but
     *        fleets that use them will continue to work.
     */

    public void setRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime script. The runtime configuration defines the server executables or launch
     * script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a
     * fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails
     * with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>, although requests that contain values for these parameters instead of a
     * runtime configuration will continue to work.) This parameter is required unless the parameters
     * <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced
     * these parameters, but fleets that use them will continue to work.
     * </p>
     * 
     * @return Instructions for launching server processes on each instance in the fleet. Server processes run either a
     *         custom game build executable or a Realtime script. The runtime configuration defines the server
     *         executables or launch script file, launch parameters, and the number of processes to run concurrently on
     *         each instance. When creating a fleet, the runtime configuration must have at least one server process
     *         configuration; otherwise the request fails with an invalid request exception. (This parameter replaces
     *         the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>, although requests
     *         that contain values for these parameters instead of a runtime configuration will continue to work.) This
     *         parameter is required unless the parameters <code>ServerLaunchPath</code> and
     *         <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced these parameters, but
     *         fleets that use them will continue to work.
     */

    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime script. The runtime configuration defines the server executables or launch
     * script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a
     * fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails
     * with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>, although requests that contain values for these parameters instead of a
     * runtime configuration will continue to work.) This parameter is required unless the parameters
     * <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced
     * these parameters, but fleets that use them will continue to work.
     * </p>
     * 
     * @param runtimeConfiguration
     *        Instructions for launching server processes on each instance in the fleet. Server processes run either a
     *        custom game build executable or a Realtime script. The runtime configuration defines the server
     *        executables or launch script file, launch parameters, and the number of processes to run concurrently on
     *        each instance. When creating a fleet, the runtime configuration must have at least one server process
     *        configuration; otherwise the request fails with an invalid request exception. (This parameter replaces the
     *        parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>, although requests that
     *        contain values for these parameters instead of a runtime configuration will continue to work.) This
     *        parameter is required unless the parameters <code>ServerLaunchPath</code> and
     *        <code>ServerLaunchParameters</code> are defined. Runtime configuration replaced these parameters, but
     *        fleets that use them will continue to work.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
        return this;
    }

    /**
     * <p>
     * A policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        A policy that limits the number of game sessions an individual player can create over a span of time for
     *        this fleet.
     */

    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * A policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     * 
     * @return A policy that limits the number of game sessions an individual player can create over a span of time for
     *         this fleet.
     */

    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * A policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        A policy that limits the number of game sessions an individual player can create over a span of time for
     *        this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        setResourceCreationLimitPolicy(resourceCreationLimitPolicy);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all
     * fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A
     * fleet can only be included in one metric group at a time.
     * </p>
     * 
     * @return The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics
     *         for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new
     *         metric group. A fleet can only be included in one metric group at a time.
     */

    public java.util.List<String> getMetricGroups() {
        return metricGroups;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all
     * fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A
     * fleet can only be included in one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics
     *        for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new
     *        metric group. A fleet can only be included in one metric group at a time.
     */

    public void setMetricGroups(java.util.Collection<String> metricGroups) {
        if (metricGroups == null) {
            this.metricGroups = null;
            return;
        }

        this.metricGroups = new java.util.ArrayList<String>(metricGroups);
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all
     * fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A
     * fleet can only be included in one metric group at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricGroups(java.util.Collection)} or {@link #withMetricGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricGroups
     *        The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics
     *        for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new
     *        metric group. A fleet can only be included in one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withMetricGroups(String... metricGroups) {
        if (this.metricGroups == null) {
            setMetricGroups(new java.util.ArrayList<String>(metricGroups.length));
        }
        for (String ele : metricGroups) {
            this.metricGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all
     * fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A
     * fleet can only be included in one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics
     *        for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new
     *        metric group. A fleet can only be included in one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withMetricGroups(java.util.Collection<String> metricGroups) {
        setMetricGroups(metricGroups);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You
     * can find your account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @param peerVpcAwsAccountId
     *        A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet
     *        with. You can find your account ID in the AWS Management Console under account settings.
     */

    public void setPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
    }

    /**
     * <p>
     * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You
     * can find your account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @return A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet
     *         with. You can find your account ID in the AWS Management Console under account settings.
     */

    public String getPeerVpcAwsAccountId() {
        return this.peerVpcAwsAccountId;
    }

    /**
     * <p>
     * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You
     * can find your account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @param peerVpcAwsAccountId
     *        A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet
     *        with. You can find your account ID in the AWS Management Console under account settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        setPeerVpcAwsAccountId(peerVpcAwsAccountId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *        in the same Region as your fleet. To look up a VPC ID, use the <a
     *        href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *        about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     *        GameLift Fleets</a>.
     */

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * 
     * @return A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must
     *         be in the same Region as your fleet. To look up a VPC ID, use the <a
     *         href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *         about VPC peering in <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     *         Amazon GameLift Fleets</a>.
     */

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the AWS Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *        in the same Region as your fleet. To look up a VPC ID, use the <a
     *        href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *        about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     *        GameLift Fleets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     * <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on the
     * instance type selected for this fleet. Learn more about <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     *        <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on
     *        the instance type selected for this fleet. Learn more about <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>.
     * @see FleetType
     */

    public void setFleetType(String fleetType) {
        this.fleetType = fleetType;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     * <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on the
     * instance type selected for this fleet. Learn more about <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>.
     * </p>
     * 
     * @return Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     *         <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on
     *         the instance type selected for this fleet. Learn more about <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *         > On-Demand versus Spot Instances</a>.
     * @see FleetType
     */

    public String getFleetType() {
        return this.fleetType;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     * <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on the
     * instance type selected for this fleet. Learn more about <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     *        <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on
     *        the instance type selected for this fleet. Learn more about <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withFleetType(String fleetType) {
        setFleetType(fleetType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     * <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on the
     * instance type selected for this fleet. Learn more about <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     *        <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on
     *        the instance type selected for this fleet. Learn more about <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>.
     * @see FleetType
     */

    public void setFleetType(FleetType fleetType) {
        withFleetType(fleetType);
    }

    /**
     * <p>
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     * <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on the
     * instance type selected for this fleet. Learn more about <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is
     *        <code>ON_DEMAND</code>. Both categories of instances use identical hardware and configurations based on
     *        the instance type selected for this fleet. Learn more about <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withFleetType(FleetType fleetType) {
        this.fleetType = fleetType.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance role
     * ARN allow applications that are running on the fleet's instances to assume the role. Learn more about using
     * on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>. To call this operation with instance role ARN, you must have IAM
     * PassRole permissions. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM policy
     * examples for GameLift</a>.
     * </p>
     * 
     * @param instanceRoleArn
     *        A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance
     *        role ARN allow applications that are running on the fleet's instances to assume the role. Learn more about
     *        using on-box credentials for your game servers at <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Access external resources from a game server</a>. To call this operation with instance role ARN, you must
     *        have IAM PassRole permissions. See <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM
     *        policy examples for GameLift</a>.
     */

    public void setInstanceRoleArn(String instanceRoleArn) {
        this.instanceRoleArn = instanceRoleArn;
    }

    /**
     * <p>
     * A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance role
     * ARN allow applications that are running on the fleet's instances to assume the role. Learn more about using
     * on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>. To call this operation with instance role ARN, you must have IAM
     * PassRole permissions. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM policy
     * examples for GameLift</a>.
     * </p>
     * 
     * @return A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance
     *         role ARN allow applications that are running on the fleet's instances to assume the role. Learn more
     *         about using on-box credentials for your game servers at <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *         Access external resources from a game server</a>. To call this operation with instance role ARN, you must
     *         have IAM PassRole permissions. See <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM
     *         policy examples for GameLift</a>.
     */

    public String getInstanceRoleArn() {
        return this.instanceRoleArn;
    }

    /**
     * <p>
     * A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance role
     * ARN allow applications that are running on the fleet's instances to assume the role. Learn more about using
     * on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>. To call this operation with instance role ARN, you must have IAM
     * PassRole permissions. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM policy
     * examples for GameLift</a>.
     * </p>
     * 
     * @param instanceRoleArn
     *        A unique identifier for an AWS IAM role that manages access to your AWS services. Fleets with an instance
     *        role ARN allow applications that are running on the fleet's instances to assume the role. Learn more about
     *        using on-box credentials for your game servers at <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Access external resources from a game server</a>. To call this operation with instance role ARN, you must
     *        have IAM PassRole permissions. See <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html">IAM
     *        policy examples for GameLift</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withInstanceRoleArn(String instanceRoleArn) {
        setInstanceRoleArn(instanceRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting
     * traffic between game clients and game servers running on GameLift. If this parameter is not specified, the
     * default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is created. Learn more at
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     * >Securing Client/Server Communication</a>.
     * </p>
     * <p>
     * Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS global
     * partition but not in all other partitions. When working in a partition that does not support this feature, a
     * request for a new fleet with certificate generation results fails with a 4xx unsupported Region error.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateConfiguration
     *        Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for
     *        encrypting traffic between game clients and game servers running on GameLift. If this parameter is not
     *        specified, the default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is
     *        created. Learn more at <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     *        >Securing Client/Server Communication</a>. </p>
     *        <p>
     *        Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS
     *        global partition but not in all other partitions. When working in a partition that does not support this
     *        feature, a request for a new fleet with certificate generation results fails with a 4xx unsupported Region
     *        error.
     *        </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     */

    public void setCertificateConfiguration(CertificateConfiguration certificateConfiguration) {
        this.certificateConfiguration = certificateConfiguration;
    }

    /**
     * <p>
     * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting
     * traffic between game clients and game servers running on GameLift. If this parameter is not specified, the
     * default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is created. Learn more at
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     * >Securing Client/Server Communication</a>.
     * </p>
     * <p>
     * Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS global
     * partition but not in all other partitions. When working in a partition that does not support this feature, a
     * request for a new fleet with certificate generation results fails with a 4xx unsupported Region error.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for
     *         encrypting traffic between game clients and game servers running on GameLift. If this parameter is not
     *         specified, the default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is
     *         created. Learn more at <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     *         >Securing Client/Server Communication</a>. </p>
     *         <p>
     *         Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS
     *         global partition but not in all other partitions. When working in a partition that does not support this
     *         feature, a request for a new fleet with certificate generation results fails with a 4xx unsupported
     *         Region error.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *         </p>
     *         </li>
     */

    public CertificateConfiguration getCertificateConfiguration() {
        return this.certificateConfiguration;
    }

    /**
     * <p>
     * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting
     * traffic between game clients and game servers running on GameLift. If this parameter is not specified, the
     * default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is created. Learn more at
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     * >Securing Client/Server Communication</a>.
     * </p>
     * <p>
     * Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS global
     * partition but not in all other partitions. When working in a partition that does not support this feature, a
     * request for a new fleet with certificate generation results fails with a 4xx unsupported Region error.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateConfiguration
     *        Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for
     *        encrypting traffic between game clients and game servers running on GameLift. If this parameter is not
     *        specified, the default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is
     *        created. Learn more at <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-howitworks.html#gamelift-howitworks-security"
     *        >Securing Client/Server Communication</a>. </p>
     *        <p>
     *        Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS
     *        global partition but not in all other partitions. When working in a partition that does not support this
     *        feature, a request for a new fleet with certificate generation results fails with a 4xx unsupported Region
     *        error.
     *        </p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>GENERATED</b> - Generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> - (default) Do not generate a TLS/SSL certificate for this fleet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withCertificateConfiguration(CertificateConfiguration certificateConfiguration) {
        setCertificateConfiguration(certificateConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *         AWS resources are useful for resource management, access management and cost allocation. For more
     *         information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *         Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *         The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBuildId() != null)
            sb.append("BuildId: ").append(getBuildId()).append(",");
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId()).append(",");
        if (getServerLaunchPath() != null)
            sb.append("ServerLaunchPath: ").append(getServerLaunchPath()).append(",");
        if (getServerLaunchParameters() != null)
            sb.append("ServerLaunchParameters: ").append(getServerLaunchParameters()).append(",");
        if (getLogPaths() != null)
            sb.append("LogPaths: ").append(getLogPaths()).append(",");
        if (getEC2InstanceType() != null)
            sb.append("EC2InstanceType: ").append(getEC2InstanceType()).append(",");
        if (getEC2InboundPermissions() != null)
            sb.append("EC2InboundPermissions: ").append(getEC2InboundPermissions()).append(",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: ").append(getNewGameSessionProtectionPolicy()).append(",");
        if (getRuntimeConfiguration() != null)
            sb.append("RuntimeConfiguration: ").append(getRuntimeConfiguration()).append(",");
        if (getResourceCreationLimitPolicy() != null)
            sb.append("ResourceCreationLimitPolicy: ").append(getResourceCreationLimitPolicy()).append(",");
        if (getMetricGroups() != null)
            sb.append("MetricGroups: ").append(getMetricGroups()).append(",");
        if (getPeerVpcAwsAccountId() != null)
            sb.append("PeerVpcAwsAccountId: ").append(getPeerVpcAwsAccountId()).append(",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: ").append(getPeerVpcId()).append(",");
        if (getFleetType() != null)
            sb.append("FleetType: ").append(getFleetType()).append(",");
        if (getInstanceRoleArn() != null)
            sb.append("InstanceRoleArn: ").append(getInstanceRoleArn()).append(",");
        if (getCertificateConfiguration() != null)
            sb.append("CertificateConfiguration: ").append(getCertificateConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
            return false;
        if (other.getServerLaunchPath() == null ^ this.getServerLaunchPath() == null)
            return false;
        if (other.getServerLaunchPath() != null && other.getServerLaunchPath().equals(this.getServerLaunchPath()) == false)
            return false;
        if (other.getServerLaunchParameters() == null ^ this.getServerLaunchParameters() == null)
            return false;
        if (other.getServerLaunchParameters() != null && other.getServerLaunchParameters().equals(this.getServerLaunchParameters()) == false)
            return false;
        if (other.getLogPaths() == null ^ this.getLogPaths() == null)
            return false;
        if (other.getLogPaths() != null && other.getLogPaths().equals(this.getLogPaths()) == false)
            return false;
        if (other.getEC2InstanceType() == null ^ this.getEC2InstanceType() == null)
            return false;
        if (other.getEC2InstanceType() != null && other.getEC2InstanceType().equals(this.getEC2InstanceType()) == false)
            return false;
        if (other.getEC2InboundPermissions() == null ^ this.getEC2InboundPermissions() == null)
            return false;
        if (other.getEC2InboundPermissions() != null && other.getEC2InboundPermissions().equals(this.getEC2InboundPermissions()) == false)
            return false;
        if (other.getNewGameSessionProtectionPolicy() == null ^ this.getNewGameSessionProtectionPolicy() == null)
            return false;
        if (other.getNewGameSessionProtectionPolicy() != null
                && other.getNewGameSessionProtectionPolicy().equals(this.getNewGameSessionProtectionPolicy()) == false)
            return false;
        if (other.getRuntimeConfiguration() == null ^ this.getRuntimeConfiguration() == null)
            return false;
        if (other.getRuntimeConfiguration() != null && other.getRuntimeConfiguration().equals(this.getRuntimeConfiguration()) == false)
            return false;
        if (other.getResourceCreationLimitPolicy() == null ^ this.getResourceCreationLimitPolicy() == null)
            return false;
        if (other.getResourceCreationLimitPolicy() != null && other.getResourceCreationLimitPolicy().equals(this.getResourceCreationLimitPolicy()) == false)
            return false;
        if (other.getMetricGroups() == null ^ this.getMetricGroups() == null)
            return false;
        if (other.getMetricGroups() != null && other.getMetricGroups().equals(this.getMetricGroups()) == false)
            return false;
        if (other.getPeerVpcAwsAccountId() == null ^ this.getPeerVpcAwsAccountId() == null)
            return false;
        if (other.getPeerVpcAwsAccountId() != null && other.getPeerVpcAwsAccountId().equals(this.getPeerVpcAwsAccountId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getFleetType() == null ^ this.getFleetType() == null)
            return false;
        if (other.getFleetType() != null && other.getFleetType().equals(this.getFleetType()) == false)
            return false;
        if (other.getInstanceRoleArn() == null ^ this.getInstanceRoleArn() == null)
            return false;
        if (other.getInstanceRoleArn() != null && other.getInstanceRoleArn().equals(this.getInstanceRoleArn()) == false)
            return false;
        if (other.getCertificateConfiguration() == null ^ this.getCertificateConfiguration() == null)
            return false;
        if (other.getCertificateConfiguration() != null && other.getCertificateConfiguration().equals(this.getCertificateConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchPath() == null) ? 0 : getServerLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchParameters() == null) ? 0 : getServerLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getLogPaths() == null) ? 0 : getLogPaths().hashCode());
        hashCode = prime * hashCode + ((getEC2InstanceType() == null) ? 0 : getEC2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getEC2InboundPermissions() == null) ? 0 : getEC2InboundPermissions().hashCode());
        hashCode = prime * hashCode + ((getNewGameSessionProtectionPolicy() == null) ? 0 : getNewGameSessionProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfiguration() == null) ? 0 : getRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationLimitPolicy() == null) ? 0 : getResourceCreationLimitPolicy().hashCode());
        hashCode = prime * hashCode + ((getMetricGroups() == null) ? 0 : getMetricGroups().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcAwsAccountId() == null) ? 0 : getPeerVpcAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getInstanceRoleArn() == null) ? 0 : getInstanceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateConfiguration() == null) ? 0 : getCertificateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }

}
