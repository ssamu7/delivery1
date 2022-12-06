package delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import delivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired CustomerInfoRepository customerInfoRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_Notify(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener Notify : " + orderAccepted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_Notify(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener Notify : " + cookStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_Notify(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener Notify : " + cookFinished + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PickedByRider'")
    public void wheneverPickedByRider_Notify(@Payload PickedByRider pickedByRider){

        PickedByRider event = pickedByRider;
        System.out.println("\n\n##### listener Notify : " + pickedByRider + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PointEarned'")
    public void wheneverPointEarned_Notify(@Payload PointEarned pointEarned){

        PointEarned event = pointEarned;
        System.out.println("\n\n##### listener Notify : " + pointEarned + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_EarnDeliveryPoints(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener EarnDeliveryPoints : " + delivered + "\n\n");


        

        // Sample Logic //
        CustomerInfo.earnDeliveryPoints(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PickedByCustomer'")
    public void wheneverPickedByCustomer_EarnDeliveryPoints(@Payload PickedByCustomer pickedByCustomer){

        PickedByCustomer event = pickedByCustomer;
        System.out.println("\n\n##### listener EarnDeliveryPoints : " + pickedByCustomer + "\n\n");


        

        // Sample Logic //
        CustomerInfo.earnDeliveryPoints(event);
        

        

    }

}


