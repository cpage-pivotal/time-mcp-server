package org.tanzu.timemcp;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tanzu.timemcp.time.TimeService;

import java.util.List;

@SpringBootApplication
public class TimeMcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeMcpApplication.class, args);
    }

    @Bean
    public List<ToolCallback> registerTools(TimeService timeService) {
        return List.of(ToolCallbacks.from(timeService));
    }

}
