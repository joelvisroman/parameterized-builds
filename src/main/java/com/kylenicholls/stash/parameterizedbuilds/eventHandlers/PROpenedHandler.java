package com.kylenicholls.stash.parameterizedbuilds.eventHandlers;

import com.atlassian.bitbucket.event.pull.PullRequestOpenedEvent;
import com.atlassian.bitbucket.event.pull.PullRequestReopenedEvent;
import com.atlassian.bitbucket.event.pull.PullRequestRescopedEvent;
import com.atlassian.bitbucket.pull.PullRequestService;
import com.kylenicholls.stash.parameterizedbuilds.ciserver.Jenkins;
import com.kylenicholls.stash.parameterizedbuilds.helper.SettingsService;
import com.kylenicholls.stash.parameterizedbuilds.item.Job.Trigger;

public class PROpenedHandler extends PRHandler{

    public PROpenedHandler(SettingsService settingsService, PullRequestService pullRequestService, Jenkins jenkins,
                           PullRequestOpenedEvent event, String url){
        super(settingsService, pullRequestService, jenkins, event, url, Trigger.PULLREQUEST);
    }

    public PROpenedHandler(SettingsService settingsService, PullRequestService pullRequestService, Jenkins jenkins,
                           PullRequestReopenedEvent event, String url){
        super(settingsService, pullRequestService, jenkins, event, url, Trigger.PULLREQUEST);
    }

    public PROpenedHandler(SettingsService settingsService, PullRequestService pullRequestService, Jenkins jenkins,
                           PullRequestRescopedEvent event, String url){
        super(settingsService, pullRequestService, jenkins, event, url, Trigger.PULLREQUEST);
    }
}
