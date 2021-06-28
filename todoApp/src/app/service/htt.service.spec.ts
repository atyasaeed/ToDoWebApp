import { TestBed } from '@angular/core/testing';

import { HttService } from './http.service';

describe('HttService', () => {
  let service: HttService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HttService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
