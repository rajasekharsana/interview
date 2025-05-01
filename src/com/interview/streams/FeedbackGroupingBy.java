package com.interview.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FeedbackGroupingBy {

    public static void main(String[] args) {
        List<Feedback> feedbackList = Arrays.asList(
                new Feedback("C1", "Great service"),
                new Feedback("C2", "Quick response"),
                new Feedback("C3", "Great service"),
                new Feedback("C4", "Quick response"),
                new Feedback("C5", "Good delivery")
        );

        Map<String, List<Feedback>> feedbackGrouped = feedbackList.stream()
                .collect(Collectors.groupingBy(feedback -> feedback.feedbackText));

        System.out.println(feedbackGrouped);

        List<String> duplicateFeedbacks = feedbackGrouped.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicateFeedbacks);
    }


    static class Feedback {
        private String feedbackId;
        private String feedbackText;

        public Feedback(String feedbackId, String feedbackText) {
            this.feedbackId = feedbackId;
            this.feedbackText = feedbackText;

        }

        public String getFeedbackText() {
            return feedbackText;
        }

        public void setFeedbackText(String feedbackText) {
            this.feedbackText = feedbackText;
        }

        public String getFeedbackId() {
            return feedbackId;
        }

        public void setFeedbackId(String feedbackId) {
            this.feedbackId = feedbackId;
        }

        @Override
        public String toString() {
            return "Feedback{" +
                    "feedbackId='" + feedbackId + '\'' +
                    ", feedbackText='" + feedbackText + '\'' +
                    '}';
        }
    }
}
