import icon from '../../assets/img/notification-icon.svg';
import './styles.css';

function NotificationButton() {
  
    return (
      <div>
        <img className="dsmeta-red-btn" src={icon} alt="Notificar"/>
      </div>
    );
};
  
  export default NotificationButton;
  