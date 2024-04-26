
import { Link } from 'react-router-dom';

import { Navbar, Container,Button } from 'react-bootstrap';

import './Dashboard.css'; // Import your custom CSS file
import CustomerLoanStatusTable from './CustomerLoanStatusTable';

function BrandExample() {
  return (
    <>

<nav class="navbar navbar-expand-lg navbar-light bg-light">

  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">   <Button
            as={Link}
            to="/registration"
            variant="outline-light"
            className="custom-button"
          >
            Customer Registration
          </Button> </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">    <Button
            as={Link}
            to="/loan"
            variant="outline-light"
            className="custom-button"
          >
            Customer Loan
          </Button></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> <Button
            as={Link}
            to="/loan-status"
            variant="outline-light"
            className="custom-button"
          >
            Customer Loan Status Table
          </Button></a>
      </li>
      <li class="nav-item">
     
      </li>
    </ul>
  </div>
</nav>

<CustomerLoanStatusTable/>
     </>
  );
}

export default BrandExample;
